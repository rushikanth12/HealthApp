package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    WebDriver driver;
    @FindBy(xpath = "/html/body/div/div/nav/div/div/ul/li[2]/a")
    public WebElement registerLink;

    @FindBy(xpath = "/html/body/div/div/nav/div/div/ul/li[3]/a")
    public WebElement LoginLink;

    @FindBy(xpath ="/html/body/div/div/nav/div/div/ul/ul/li[3]/a")
    public WebElement LogOutLink;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void clickRegisterLink() {
        registerLink.click();
    }

    public void clickLoginLink() {
        LoginLink.click();
    }

    public boolean verifyLogout()
    {
       return LogOutLink.isDisplayed();
    }



}
