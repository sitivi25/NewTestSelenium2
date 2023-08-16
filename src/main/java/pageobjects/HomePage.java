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
    public String gallery_Btn = "//div[contains(text(),'Course Gallery')]";



    public void takeMeToLoginPage() throws InterruptedException {
        driver.get(websiteURL);
        Thread.sleep(3000);
        driver.findElement(By.xpath(signIn_Btn)).click();
        }

    public void takeMeToTheGalleryPage() throws InterruptedException{
        driver.get(websiteURL);
        Thread.sleep(2000);
        driver.findElement(By.xpath(gallery_Btn)).click();
        }


    public void openHomePage(){
            driver.get(websiteURL);
        }
}



