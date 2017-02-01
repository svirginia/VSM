package pages;

import components.BaseWebUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Virginia Sanabria on 1/31/2017.
 */
public class HomePage extends BaseWebUI {
    @FindBy(linkText = "Log in")
    @CacheLookup
    private WebElement loginBtn;

    public MainApp loginAs(String username, String password) {
        LoginPage loginPage = clickLoginBtn()
                .setEmailTxt(username)
                .setPasswordTxt(password);
        return loginPage.clickLoginBtn();
    }

    public LoginPage clickLoginBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtn.click();
        return new LoginPage();
    }

    public MainApp loginAsPrimaryUser() {
        return loginAs("virginiad", "Cddd");
    }
}
