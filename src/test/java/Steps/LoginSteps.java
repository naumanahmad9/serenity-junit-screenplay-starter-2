package Steps;

import Pages.DashboardPage;
import Pages.LoginPage;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class LoginSteps  extends UIInteractions {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    // username input step
    @Step
    public void enterUsername(String username) {
        loginPage.usernameField.sendKeys(username);
    }

    // password input step
    @Step
    public void enterPassword(String password) {
        loginPage.passwordField.sendKeys(password);
    }

    // click login button step
    @Step
    public void clickLoginButton() {
        loginPage.loginButton.click();
    }

    // verify login step
    @Step
    public String verifyLogin() {
        // get Dashboard's heading text
        String dashboardHeadingText = dashboardPage.dashboardHeading.getText();
        System.out.println("DASHBOARD HEADING TEXT: " + dashboardHeadingText);
        return dashboardHeadingText;
    }

}
