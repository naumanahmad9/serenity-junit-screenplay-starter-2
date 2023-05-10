package Steps;

import net.serenitybdd.core.steps.UIInteractions;

public class NavigateSteps extends UIInteractions {

    // Navigate to home page
    public void toOrangeHomePage() {
        openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}