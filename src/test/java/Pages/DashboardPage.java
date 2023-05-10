package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class DashboardPage extends PageObject {

    // Locate dashboard heading
    @FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
    public WebElement dashboardHeading;
}
