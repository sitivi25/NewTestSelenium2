import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitAndDriver1 extends BaseTest {
    public String email = "testing@my-fork.com";
    public String password = "Password";

      @Test
        public void waitAndDriverActions() throws InterruptedException {


            driver.get("https://test.my-fork.com/login");

            WebDriverWait waitForDropdownToLoad = new WebDriverWait(driver, Duration.ofSeconds(50));
            waitForDropdownToLoad.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='loginButton']/button")));


            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testing@my-fork.com");
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password");
            driver.findElement(By.xpath("//div[@id='loginButton']/button")).sendKeys(Keys.ENTER);
            System.out.println(driver.findElement(By.xpath("//div[@class='test-login-errors']")).isDisplayed());

      }
}
