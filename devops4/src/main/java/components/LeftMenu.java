package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Virginia Sanabria on 1/31/2017.
 */
public class LeftMenu extends BaseWebUI {
    @FindBy(linkText = "Add Project")
    @CacheLookup
    private WebElement addProjectLnk;


    @FindBy(xpath = "//td[contains(.,'Edit project')]")
    @CacheLookup
    private WebElement editProjectOption;

    @FindBy(xpath = "//td[contains(.,'Delete project')]")
    @CacheLookup
    private WebElement deleteProjectOption;

    public AddProjectForm clickAddProjectLnk() {
        addProjectLnk.click();
        return new AddProjectForm();
    }
}
