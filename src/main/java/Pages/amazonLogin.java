package Pages;

import cucumber.api.java.After;
import org.junit.AfterClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.utilitiesImpl;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class amazonLogin {
    WebDriver driver;
    utilitiesImpl utilities = new utilitiesImpl();

    @FindBy(xpath = "//*[@id='nav-tools']/a[2]")
    WebElement signInButton;

    @FindBy(id = "ap_email")
    WebElement emailOrMobile;

    @FindBy(id = "continue")
    WebElement continueButton;

    @FindBy(id = "ap_password")
    WebElement password;

    @FindBy(id = "signInSubmit")
    WebElement SignIn;

    public amazonLogin(){
        System.setProperty("webdriver.chrome.driver", "C:\\BDD_Cucumber_Framework\\drivers\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in");
        PageFactory.initElements(driver, this);
    }

    public void click_SignIn(){
        utilities.clickElement(signInButton);
    }

    public void enterUserDetails(String username, String Password) throws InterruptedException {
        utilities.sendKeys(emailOrMobile, username);
        utilities.clickElement(continueButton);
       /* Thread.sleep(2000);
        utilities.sendKeys(password, Password);*/
    }

    public void clickLoginButton(){
        utilities.clickElement(SignIn);
    }

    public void tearDown(){
        System.out.println("Closing and quiting the driver");
        driver.close();
        driver.quit();
    }
}
