package NewTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewTestCaseCheckbox {
    @Test
    public void startDriver() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZenBook\\IdeaProjects\\NewTestSelenium2\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        Thread.sleep(1000);
        driver.get("https://test.my-fork.com/login");

        System.out.println(driver.findElement(By.id("auth-page-remember-me")).isSelected());

    }
}
