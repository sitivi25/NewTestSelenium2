package NewTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewTestCaseInvalid {
    @Test
    public void startDriver(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZenBook\\IdeaProjects\\NewTestSelenium2\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/login");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email@gg.y");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//div[@id='loginButton']/button")).sendKeys(Keys.ENTER);

    }
}
//div[@class='test-login-errors']