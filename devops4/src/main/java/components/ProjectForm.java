package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Virginia Sanabria on 1/31/2017.
 */
public class ProjectForm extends BaseWebUI {
    @FindBy(name = "ta")
    @CacheLookup
    private WebElement projectNameTxt;

    public void setProjectName(String projectName) {
        wait.until(ExpectedConditions
                .visibilityOf(projectNameTxt));
        projectNameTxt.clear();
        projectNameTxt.sendKeys(projectName);
    }
}
