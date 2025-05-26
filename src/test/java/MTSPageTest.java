import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.MainMTSPageSteps;

import java.time.Duration;

import static steps.DriverInstance.getInstance;

public class MTSPageTest {

    private static WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = getInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://www.mts.by/");
        boolean acceptCookie = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cookie-agree"))).isDisplayed();
        if (acceptCookie) {
            driver.findElement(By.id("cookie-agree")).click();
        }
    }

    @AfterAll
    public static void  tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @DisplayName("Check communication services and frame payment. Task 2")
    public void checkCommunicationServices() {
        MainMTSPageSteps mainMTSPageSteps = new MainMTSPageSteps(driver, wait);
        mainMTSPageSteps.clickButtonArrow();
        mainMTSPageSteps.clickSelect();
        mainMTSPageSteps.sendSum("20");
        mainMTSPageSteps.sendPhoneNumber("297777777");
        mainMTSPageSteps.sendEmail("mail@mail.ru");
        mainMTSPageSteps.clickContinueButton();
        mainMTSPageSteps.checkFrameAndSwitch();
        mainMTSPageSteps.checkSumBYN();
        mainMTSPageSteps.checkPhoneNumber();
        mainMTSPageSteps.checkPlaceholderCardNumber();
        mainMTSPageSteps.checkValidityPeriod();
        mainMTSPageSteps.checkPaymentsIcon();
        mainMTSPageSteps.checkCVC();
        mainMTSPageSteps.checkName();
        mainMTSPageSteps.checkButtonPay();
    }

    @Test
    @DisplayName("Сheck placeholders in the payment section. Task 1")
    public void checkPlaceholder() {
        MainMTSPageSteps mainMTSPageSteps = new MainMTSPageSteps(driver, wait);
        mainMTSPageSteps.clickButtonArrow();
        mainMTSPageSteps.clickSelect();
        mainMTSPageSteps.checkCommunicationServicesPlaceholder();
        mainMTSPageSteps.clickButtonArrow();
        mainMTSPageSteps.selectInternet();
        mainMTSPageSteps.checkPlaceholdrsInternet();
        mainMTSPageSteps.clickButtonArrow();
        mainMTSPageSteps.selectDebt();
        mainMTSPageSteps.checkPlasholderDebt();
        mainMTSPageSteps.clickButtonArrow();
        mainMTSPageSteps.selectInstallmentPlan();
        mainMTSPageSteps.checkPlaceholdersInstallmentPlan();
    }
}