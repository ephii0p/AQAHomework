package steps;

import io.qameta.allure.Step;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainMTSPage;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;


public class MainMTSPageSteps {

    private final MainMTSPage mainMTSPage;
    private final WebDriver driver;
    private final WebDriverWait wait;


    public MainMTSPageSteps(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.mainMTSPage = new MainMTSPage();
    }
    @Step
    public void clickButtonArrow() {
        driver.findElement(mainMTSPage.getButtonArrow()).click();

    }
    @Step
    public void clickSelect() {
        driver.findElement(mainMTSPage.getSelect()).click();
    }
    @Step
    public void sendPhoneNumber(String phoneNumber) {
        driver.findElement(mainMTSPage.getPhoneNumber()).sendKeys(phoneNumber);
    }
    @Step
    public void sendSum(String sum) {
        driver.findElement(mainMTSPage.getSum()).sendKeys(sum);
    }
    @Step
    public void sendEmail(String email) {
        driver.findElement(mainMTSPage.getEmail()).sendKeys(email);
    }
    @Step
    public void clickContinueButton() {
        driver.findElement(mainMTSPage.getContinueButton()).click();
    }
    @Step
    public void checkFrameAndSwitch() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'bepaid-iframe']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class = 'bepaid-iframe']")));
    }
    @Step
    public void checkSumBYN() {
        WebElement sumBYN = driver.findElement(By.xpath("//*[@class = 'pay-description__cost']//span[1]"));
        String exceptedSumBYN = "20.00 BYN";
        String actualSumBYN = sumBYN.getAttribute("innerText");
        Assert.assertEquals(exceptedSumBYN, actualSumBYN);
    }
    @Step
    public void checkPhoneNumber() {
        WebElement checkPhoneNumberIframe = driver.findElement(By.xpath("//*[@class = 'pay-description__text']//span"));
        String actualPhoneNumber = checkPhoneNumberIframe.getAttribute("innerText");
        String exceptedPhoneNumber = "Оплата: Услуги связи Номер:375297777777";
        Assert.assertEquals(exceptedPhoneNumber, actualPhoneNumber);
    }
    @Step
    public void checkPlaceholderCardNumber() {
        WebElement placeholderCardNumber = driver.findElement(By.xpath("//label[@class = 'ng-tns-c46-1 ng-star-inserted']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class = 'ng-tns-c46-1 ng-star-inserted']")));
        String exceptedPlaceholderCardNumber = "Номер карты";
        String actualPlaceholderCardNumber = placeholderCardNumber.getAttribute("innerText");
        Assert.assertEquals(exceptedPlaceholderCardNumber, actualPlaceholderCardNumber);
    }
    @Step
    public void checkValidityPeriod() {
        WebElement placeholderValidityPeriod = driver.findElement(By.xpath("//label[@class = 'ng-tns-c46-4 ng-star-inserted']"));
        assertTrue(placeholderValidityPeriod.isDisplayed());
        String exceptedPlaceholderValidityPeriod = "Срок действия";
        String actualPlaceholderValidityPeriod = placeholderValidityPeriod.getAttribute("innerText");
        Assert.assertEquals(exceptedPlaceholderValidityPeriod, actualPlaceholderValidityPeriod);
    }
    @Step
    public void checkPaymentsIcon() {
        WebElement iconVisaSystem = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/visa-system.svg']"));
        assertTrue(iconVisaSystem.isDisplayed());
        WebElement iconMasterCard = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']"));
        assertTrue(iconMasterCard.isDisplayed());
        WebElement iconBelkart = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']"));
        assertTrue(iconBelkart.isDisplayed());
        WebElement iconRandomPayments = driver.findElement(By.xpath("//div[@class='cards-brands cards-brands_random ng-tns-c61-0 ng-star-inserted']"));
        assertTrue(iconRandomPayments.isDisplayed());
    }
    @Step
    public void checkCVC() {
        WebElement cvc = driver.findElement(By.xpath("//*[@class='ng-tns-c46-5 ng-star-inserted']"));
        assertTrue(cvc.isDisplayed());
    }
    @Step
    public void checkName() {
        WebElement name = driver.findElement(By.xpath("//*[@class='ng-tns-c46-3 ng-star-inserted']"));
        assertTrue(name.isDisplayed());
    }
    @Step
    public void checkButtonPay() {
        WebElement buttonPay = driver.findElement(By.xpath("//button[@class='colored disabled']"));
        assertTrue(buttonPay.isDisplayed());
        String exceptedButtonPay = "Оплатить 20.00 BYN";
        String actualButtonPay = buttonPay.getText();
        assertEquals(exceptedButtonPay, actualButtonPay);
    }
    @Step
    public void selectInternet() {
        driver.findElement(mainMTSPage.getSelectInternet()).click();
    }
    @Step
    public void selectInstallmentPlan() {
        driver.findElement(mainMTSPage.getSelectInstallmentPlan()).click();
    }
    @Step
    public void selectDebt() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainMTSPage.getSelectDebt()));
        driver.findElement(mainMTSPage.getSelectDebt()).click();
    }
    @Step
    public void checkPlaceholdrsInternet() {
        WebElement subNumber = driver.findElement(By.xpath("//*[@placeholder='Номер абонента']"));
        assertTrue(subNumber.isDisplayed());
        WebElement internetSum = driver.findElement(By.xpath("//*[@id='internet-sum']"));
        assertTrue(internetSum.isDisplayed());
        WebElement internetEmail = driver.findElement(By.xpath("//*[@id='internet-email']"));
        assertTrue(internetEmail.isDisplayed());
    }
    @Step
    public void checkPlasholderDebt() {
        WebElement scoreArrears = driver.findElement(By.xpath("//*[@id='score-arrears']"));
        assertTrue(scoreArrears.isDisplayed());
        WebElement scoreSum = driver.findElement(By.xpath("//*[@id='arrears-sum']"));
        assertTrue(scoreSum.isDisplayed());
        WebElement arrearsEmail = driver.findElement(By.xpath("//*[@id='arrears-email']"));
        assertTrue(arrearsEmail.isDisplayed());
    }
    @Step
    public void checkPlaceholdersInstallmentPlan() {
        WebElement accountNumber = driver.findElement(By.xpath("//*[@id = 'score-instalment']"));
        assertTrue(accountNumber.isDisplayed());
        WebElement installmentSum = driver.findElement(By.xpath("//*[@id = 'instalment-sum']"));
        assertTrue(installmentSum.isDisplayed());
        WebElement installmentEmail = driver.findElement(By.xpath("//*[@id = 'instalment-email']"));
        assertTrue(installmentEmail.isDisplayed());
    }
    @Step
    public void checkCommunicationServicesPlaceholder() {
        WebElement connectionPhone = driver.findElement(By.xpath("//*[@id = 'connection-phone']"));
        assertTrue(connectionPhone.isDisplayed());
        WebElement connectionSum = driver.findElement(By.xpath("//*[@id = 'connection-sum']"));
        assertTrue(connectionSum.isDisplayed());
        WebElement connectionEmail = driver.findElement(By.xpath("//*[@id = 'connection-email']"));
        assertTrue(connectionEmail.isDisplayed());
    }
}
