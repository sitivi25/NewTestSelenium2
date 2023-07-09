import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.tab;

public class BaseTest {

    public ChromeDriver driver;

    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZenBook\\IdeaProjects\\NewTestSelenium2\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }




    @AfterMethod
    public void tearDown() {
     driver.quit();
        // Close the driver
    }

}
