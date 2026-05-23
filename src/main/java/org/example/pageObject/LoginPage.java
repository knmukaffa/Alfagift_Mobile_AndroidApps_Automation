package org.example.pageObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {

    AndroidDriver driver;

    public LoginPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(
                new AppiumFieldDecorator(driver, Duration.ofSeconds(10)),
                this);
    }

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Masuk/Daftar'])[1]")
    private WebElement loginPageTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sahabat Alfamart']")
    private WebElement sahabatAlfamartBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.alfamart.alfagift:id/tv_page_title']")
    private WebElement csPageTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.alfamart.alfagift:id/tv_menu_name' and @text='FAQ']")
    private WebElement faqMenuBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='FAQ']")
    private WebElement faqPageTitle;

    public boolean verifyLoginPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginPageTitle));

        return loginPageTitle.isDisplayed();
    }

    public void clickSahabatAlfamartBtn(){
        sahabatAlfamartBtn.click();
    }

    public void verifyCsPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(csPageTitle));

        String csTitle = csPageTitle.getText();

        Assert.assertEquals(csTitle, "Customer Service");
    }

    public void clickFaqMenuBtn(){
        faqMenuBtn.click();
    }

    public void verifyFaqPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(faqPageTitle));

        String faqTitle = faqPageTitle.getText();

        Assert.assertEquals(faqTitle, "FAQ");
    }

}
