package POM_UsingPageFact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

@FindBy(linkText = "Dismiss")
WebElement alert;

@FindBy(linkText = "My Account")
WebElement myAccount;

@FindBy(xpath = "//input[@id='username']")
WebElement userName;

@FindBy(xpath = "//input[@id='password']")
WebElement passWord;

@FindBy(xpath = "//button[@name='login']")
WebElement logInbtn;

public LoginPage(WebDriver driver){

    this.driver = driver;
}
}
