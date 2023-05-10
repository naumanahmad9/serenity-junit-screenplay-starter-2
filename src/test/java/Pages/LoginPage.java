package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {

    // Locate the username input field
    @FindBy(name="username")
    public WebElement usernameField;

    // Locate the password input field
    @FindBy(name="password")
    public WebElement passwordField;

    // Locate the login button
    @FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement loginButton;

}
