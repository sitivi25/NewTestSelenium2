import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.BaseMain;
import pageobjects.GalleryPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.time.Duration;

public class BaseTest {

    public ChromeDriver driver;

    LoginPage loginPage;
    HomePage homePage;
    BaseMain baseMain;
    GalleryPage galleryPage;

    @BeforeMethod(groups = {"home", "feature"} , alwaysRun = true)
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZenBook\\Documents\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        galleryPage = new GalleryPage(driver);
        baseMain = new BaseMain(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
    }

    @AfterMethod(groups = {"home", "feature"} , alwaysRun = true)
    public void tearDown() {
        driver.quit(); // Close the driver
    }
}
