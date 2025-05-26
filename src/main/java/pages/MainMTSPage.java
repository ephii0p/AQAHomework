package pages;

import org.openqa.selenium.By;

public class MainMTSPage {

    private final By buttonArrow = By.xpath("//span[@class='select__arrow']");
    private final By select = By.xpath("//p[contains(text(), 'Услуги связи')]");
    private final By phoneNumber = By.xpath("//input[@id='connection-phone']");
    private final By sum = By.xpath("//input[@id='connection-sum']");
    private final By email = By.xpath("//input[@id='connection-email']");
    private final By continueButton = By.xpath("//form[@class ='pay-form opened']//button");
    private final By selectInternet = By.xpath("//p[contains(text(), 'Домашний интернет')]");
    private final By selectInstallmentPlan = By.xpath("//p[contains(text(), 'Рассрочка')]");
    private final By selectDebt = By.xpath("//p[contains(text(), 'Задолженность')]");

    public By getSelectInternet() {
        return selectInternet;
    }

    public By getSelectInstallmentPlan() {
        return selectInstallmentPlan;
    }

    public By getSelectDebt() {
        return selectDebt;
    }

    public By getSelect() {
        return select;
    }

    public By getPhoneNumber() {
        return phoneNumber;
    }

    public By getSum() {
        return sum;
    }

    public By getEmail() {
        return email;
    }

    public By getContinueButton() {
        return continueButton;
    }

    public By getButtonArrow() {
        return buttonArrow;
    }
}