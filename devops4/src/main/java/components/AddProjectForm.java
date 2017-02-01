package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Virginia Sanabria on 1/31/2017.
 */
public class AddProjectForm extends ProjectForm {
    @FindBy(xpath = "//span[contains(.,'Add Project')]")
    @CacheLookup
    private WebElement addProjectBtn;

    public ProjectContainer clickAddProjectBtn() {
        addProjectBtn.click();
        return new ProjectContainer();
    }
}
