package system.tasks;

import application.page_library.*;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTasks extends BasePage {

    @Test(groups = {"smoke", "tasks"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreatingTask")
    public void testCreatingTask(String email, String password, String taskName, String description) {

        IntroPage introPage = new IntroPage();

        AuthenticationPage authenticationPage = introPage.clickLoginButton();

        HomePage homePage = authenticationPage.login(email, password);

        TasksPage tasksPage = homePage.systemBar.clickTasksButton();

        CreateTaskPage createTaskPage = tasksPage.clickCreateTaskButton();
        ItemDetailsPage itemDetailsPage = createTaskPage.createTask(taskName, description);

        if(isElementInvisible(createTaskPage.createTaskForm)){

            Assert.assertEquals(itemDetailsPage.getName(), taskName);

        }

    }

    @Test(groups = {"smoke", "tasks"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testCreatingTaskWithInvalidCompletion")
    public void testCreatingTaskWithInvalidCompletion(String email, String password, String taskName, String completionPct,
                                                      String expected) {

        IntroPage introPage = new IntroPage();

        AuthenticationPage authenticationPage = introPage.clickLoginButton();

        HomePage homePage = authenticationPage.login(email, password);

        TasksPage tasksPage = homePage.systemBar.clickTasksButton();

        CreateTaskPage createTaskPage = tasksPage.clickCreateTaskButton();
        createTaskPage.inputTaskName(taskName);
        createTaskPage.inputCompletionPercent(completionPct);
        createTaskPage.clickSaveTaskButton();

        Assert.assertEquals(createTaskPage.getCompletionPercentErrorMessage(), expected);

    }

}
