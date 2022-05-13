package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/input")
    public WebElement emailTextBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/input")
    public WebElement passwordTextBox;

    @FindBy(className = "btn btn-primary btn-md")
    public WebElement loginButton;

    public LoginPage( WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String em)
    {
        emailTextBox.sendKeys(em);
    }

    public void enterPassword(String pw)
    {
        passwordTextBox.sendKeys(pw);

    }

    public void clickLoginButton()
    {
        loginButton.click();
    }
}
