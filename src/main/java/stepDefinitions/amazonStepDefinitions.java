package stepDefinitions;

import Pages.amazonLogin;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class amazonStepDefinitions {
    amazonLogin login = new amazonLogin();

    @Given("^user is on amazon login page$")
    public void user_is_on_amazon_login_page() throws Throwable {
        login.click_SignIn();
    }

    @When("^user enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enter_username_as_and_password_as(String username, String password) throws Throwable {
        login.enterUserDetails(username, password);
    }

    @And("^user clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
        login.clickLoginButton();
    }

}
