package base;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.RegisterPage;
import utils.DriverFactory;
import utils.DriverUtils;


public class BasePage
{
    public static HomePage homePage;
    public static RegisterPage registerPage;
    public static LoginPage loginPage;
    public static DriverUtils driverUtils;

    public static void initpages()
    {
        homePage = new HomePage(DriverFactory.driver);
        registerPage = new RegisterPage(DriverFactory.driver);
        loginPage = new LoginPage(DriverFactory.driver);
        driverUtils = new DriverUtils();
    }

}
