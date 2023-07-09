package pageobjects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class BaseMain{

    public ChromeDriver driver;
    public BaseMain(ChromeDriver driver){
        this.driver = driver;
    }


    public void switchTo() {
        driver.get("https://test.my-fork.com/");
        driver.switchTo().newWindow(WindowType.TAB);
        List<String> tabHandler = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabHandler.size());
        tabHandler = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabHandler.size());
        driver.switchTo().window(tabHandler.get(0));
        driver.switchTo().window(tabHandler.get(1));
        driver.navigate().to("https://www.amazon.com/");
    }

       public void scroll(int pixels){

        driver.get("https://www.amazon.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+pixels+")", "");
        //js.executeScript("window.scrollBy(0,-2500)", "");
    }


}
