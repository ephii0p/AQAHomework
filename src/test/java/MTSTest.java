import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static junit.framework.Assert.assertTrue;

public class MTSTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://www.mts.by/");
        WebElement acceptCookie = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cookie-agree")));
        acceptCookie.click();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @DisplayName("Check Title Payments")
    public void testCheckTitleBlockName() {
        WebElement blockName = driver.findElement(By.xpath("//section[@class = 'pay']//h2[contains(text(), 'Онлайн пополнение') and contains(., 'без комиссии')]"));
        assertTrue(blockName.isDisplayed());
        System.out.println(blockName.getText() + " - title visability");
    }

    @Test
    @DisplayName("Check Logos Pay Partners System")
    public void checkLogosPayPartnersSystem() {
        WebElement payParthers = driver.findElement(By.xpath("//div[@class = 'pay__partners']//ul"));
        String[] exceptedPayParthers = {"Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт"};
        for (String text : exceptedPayParthers) {
            WebElement payParthersSystem = payParthers.findElement(By.xpath(".//img[@alt='" + text + "']"));
            assertTrue(payParthersSystem.isDisplayed());
        }
        System.out.println("logos visability");
    }

    @Test
    @DisplayName("Check link Подробнее о сервисе")
    public void checkLink() {
        WebElement link = driver.findElement(By.xpath("//a[contains(text(), 'Подробнее о сервисе')]"));
        link.click();
        WebElement checkNewLink = driver.findElement(By.xpath("//span[contains(text(), 'Порядок оплаты и безопасность интернет платежей')]"));
        assertTrue(checkNewLink.isDisplayed());
        System.out.println("The page has changed");
    }

    @Test
    @DisplayName("Check button Continue")
    public void checkButtonContinue() {
        WebElement buttonArrow = driver.findElement(By.xpath("//span[@class='select__arrow']"));
        buttonArrow.click();
        WebElement select = driver.findElement(By.xpath("//p[contains(text(), 'Услуги связи')]"));
        select.click();
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        phoneNumber.sendKeys("297777777");
        WebElement sum = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        sum.sendKeys("20");
        WebElement email = driver.findElement(By.xpath("//input[@id='connection-email']"));
        email.sendKeys("mail@mail.ru");
        WebElement continueButton = driver.findElement(By.xpath("//form[@class ='pay-form opened']//button"));
        continueButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'bepaid-iframe']")));
        System.out.println("iframe visability");
    }
}
