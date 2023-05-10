package Tests;

import Pages.DashboardPage;
import Steps.LoginSteps;
import Steps.NavigateSteps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginTest {

    @Managed(driver = "chrome", options = "headless")
    WebDriver driver;

    NavigateSteps navigate;
    LoginSteps loginSteps;

    Properties prop = new Properties();

    // Login test case
    @Test
    public void loginTest() throws IOException {

        // navigate to home page
        navigate.toOrangeHomePage();

        prop.load(new FileReader("src/test/resources/Testdata.properties"));

        // login test steps
        loginSteps.enterUsername(prop.getProperty("loginUsername"));
        loginSteps.enterPassword(prop.getProperty("loginPassword"));
        loginSteps.clickLoginButton();

        // Serenity report for login test
        Serenity.reportThat("The user has successfully logged in.",
                () -> assertThat(loginSteps.verifyLogin()).isEqualTo("Dashboard")
        );
    }
}
