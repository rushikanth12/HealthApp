import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import utils.DriverFactory;
import utils.DriverUtils;

public class StepDefinitions

{
    String actualHomePageTitle;
    String actualLoginPageTitle;
    String actualRegisterPageTitle;
    String actualLoginConfMsg;


    @Given("i am on home page of health app")
    public void i_am_on_home_page_of_health_app()
    {
        BasePage.driverUtils.navigateToUrl(DriverFactory.prop.getProperty("url"));
    }
    @Then("i will be navigated to home page")
    public void i_will_be_navigated_to_home_page()
    {
        actualHomePageTitle = BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(DriverFactory.prop.getProperty("expectedHomePageTitle"),actualHomePageTitle);
    }

    @When("i click on login button in home page")
    public void i_click_on_login_button_in_home_page()
    {
        BasePage.homePage.clickLoginLink();
    }

    @Then("i will be navigated to login page")
    public void i_will_be_navigated_to_login_page()
    {
        actualRegisterPageTitle = BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(DriverFactory.prop.getProperty("expectedLoginPageTitle"),actualLoginPageTitle);
    }

    @When("i enter email as {string}")
    public void i_enter_email_as_(String email)
    {
        BasePage.loginPage.enterEmail(email);
    }

    @And("i enter password as {string}")
    public void i_enter_password_as_(String pwd)
    {
        BasePage.loginPage.enterPassword(pwd);
    }

    @And("i click on login button")
    public void i_will_click_on_login_button()
    {
        BasePage.loginPage.clickLoginButton();
    }

    @Then("I should be login successfully into the health app")
    public void I_should_be_login_successfully_into_the_health_app()
    {
        Assertions.assertTrue(BasePage.homePage.verifyLogout(),"log out link is displayed");
    }


}
