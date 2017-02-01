import components.AddProjectForm;
import components.LeftMenu;
import components.ProjectContainer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MainApp;

/**
 * Created by Virginia Sanabria on 1/31/2017.
 */
public class AddProject {
    private MainApp mainApp;
    private LeftMenu leftMenu;
    private final String projectName = "New Project";

    @Test
    public void testAddProject() {
        HomePage homePage = new HomePage();

        MainApp mainApp = homePage.loginAsPrimaryUser();

        leftMenu = mainApp.goToLeftMenu();

        AddProjectForm addProjectForm = leftMenu.clickAddProjectLnk();
        addProjectForm.setProjectName(projectName);
        ProjectContainer projectContainer = addProjectForm.clickAddProjectBtn();

        Assert.assertEquals(projectContainer.getProjectName(), projectName);
    }
}
