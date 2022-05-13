package utils;

public class DriverUtils
{

    public static void navigatetourl(String url)
    {
        DriverFactory.driver.navigate().to(url);
    }

    public static String getPageTitle()
    {
        return DriverFactory.driver.getTitle();
    }
}
