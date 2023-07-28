import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SoftAssertions extends BaseTest{

    String workURL = "https://test.my-fork.com/";
    SoftAssert softAssert = new SoftAssert();
    String expectedTitle = "My Fork - your educational solution";
    String actualTitle;
    String menuList = "//select[@id='job-title']/option";
    String loadedURL = "https://test.my-fork.com/register";

    int listSizeActual;
    int listSizeExpected = 14;

    @Test
    public void list(){
        driver.get(loadedURL);
        actualTitle = driver.getTitle();
        List<WebElement> elementList = driver.findElements(By.xpath(menuList));
        listSizeActual = elementList.size();
        softAssert.assertEquals(listSizeActual, listSizeExpected);
        driver.get(workURL);
        actualTitle = driver.getTitle();
        softAssert.assertNotEquals(actualTitle, expectedTitle);
        System.out.println("title is different");
        driver.get(loadedURL);
        String loadedURL = driver.getCurrentUrl();
        softAssert.assertFalse(loadedURL.contains("register"),"Assertion for the URL register");
        driver.get(workURL);
        String actualHeader = driver.findElement(By.xpath("//div[@class='home-head-content-left-first-rectangle']/div")).getText();
        Assert.assertNotEquals(actualHeader, "Create your course");
        softAssert.assertAll();
    }
}
