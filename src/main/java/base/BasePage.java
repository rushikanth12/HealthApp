package base;

import PageObjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class BasePage
{
    public static WebDriver driver;
    public static Properties prop;
    public static Properties or;
    public static LoginPage loginPage;

    @Before
    public static void setUp()
    {
        prop = new Properties();
        or = new Properties();

        try
        {
            FileInputStream fs = new FileInputStream("src/main/java/config/data.properties");
            prop.load(fs);
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

        try
        {
            FileInputStream fs = new FileInputStream("src/main/java/config/or.properties");
            or.load(fs);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);


    }
    @After
    public static void teardown()
    {
        driver.quit();
    }



}
