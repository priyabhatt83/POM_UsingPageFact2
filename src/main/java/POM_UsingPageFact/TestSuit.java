package POM_UsingPageFact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestSuit {

    public static WebDriver driver;

    public static void main(String[] args) {


    System.setProperty("webdriver.chrome.driver","src\\main\\java\\POM_UsingPageFact\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://store.demoqa.com");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    loginPage.alert.click();

    loginPage.myAccount.click();
    loginPage.userName.sendKeys("testuser_1");
    loginPage.passWord.sendKeys("Test@123");
    loginPage.logInbtn.click();



    driver.quit();

}}
