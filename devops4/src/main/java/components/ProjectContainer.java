package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Virginia Sanabria on 1/31/2017.
 */
public class ProjectContainer extends BaseWebUI {
    @FindBy(xpath = "//a[@class='project_link']")
    @CacheLookup
    private WebElement projectName;

    public String getProjectName() {
        return projectName.getText();
    }
}
