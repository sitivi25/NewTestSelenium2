package NewTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewTestCaseTrueValidate {
    @Test
    public void startDriver(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZenBook\\IdeaProjects\\NewTestSelenium2\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com/login");

        System.out.println(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//input[@id='password']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//div[@id='loginButton']/button")).isDisplayed());

    }
}
