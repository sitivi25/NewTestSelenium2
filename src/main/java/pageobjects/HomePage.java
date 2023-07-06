package pageobjects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BaseMain{

    public HomePage(ChromeDriver driver) {
        super(driver);
    }

    public String websiteURL = "https://test.my-fork.com/";
    public String signIn_Btn = "//a[@class='menu-item log-in-button']";



    public void takeMeToLoginPage() throws InterruptedException {
        driver.get(websiteURL);
        Thread.sleep(3000);
        driver.findElement(By.xpath(signIn_Btn)).click();
        }
    }



