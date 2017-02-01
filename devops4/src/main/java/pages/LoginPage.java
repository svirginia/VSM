package pages;

import components.BaseWebUI;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Virginia Sanabria on 1/31/2017.
 */
public class LoginPage extends BaseWebUI {
    @FindBy(id = "email")
    @CacheLookup
    private WebElement emailTxt;

    @FindBy(id = "password")
    @CacheLookup
    private WebElement passwordTxt;

    @FindBy(linkText = "Log in")
    @CacheLookup
    private WebElement loginBtn;

    @FindBy(className = "GB_frame")
    @CacheLookup
    private WebElement frameClass;

    @FindBy(id = "GB_frame")
    @CacheLookup
    private WebElement frameID;

    public LoginPage setEmailTxt(String email) {
        try {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameClass));
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameID));
            wait.until(ExpectedConditions.visibilityOf(emailTxt));
            emailTxt.clear();
            emailTxt.sendKeys(email);
        } catch (WebDriverException e) {
            throw new WebDriverException(e);
        } finally {
            driver.switchTo().defaultContent();
        }
        return this;
    }

    public LoginPage setPasswordTxt(String password) {
        try {
            wait.until(ExpectedConditions
                    .frameToBeAvailableAndSwitchToIt(frameClass));
            wait.until(ExpectedConditions
                    .frameToBeAvailableAndSwitchToIt(frameID));
            passwordTxt.clear();
            passwordTxt.sendKeys(password);
        } catch (WebDriverException e) {
            throw new WebDriverException(e);
        } finally {
            driver.switchTo().defaultContent();
        }
        return this;
    }

    public MainApp clickLoginBtn() {
        try {
            wait.until(ExpectedConditions
                    .frameToBeAvailableAndSwitchToIt(frameClass));
            wait.until(ExpectedConditions
                    .frameToBeAvailableAndSwitchToIt(frameID));
            wait.until(ExpectedConditions
                    .elementToBeClickable(loginBtn));
            loginBtn.click();
        } catch (WebDriverException e) {
            throw new WebDriverException(e);
        } finally {
            driver.switchTo().defaultContent();
        }
        return new MainApp();
    }
}
