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

    public void switchTo(int tab) {
        List<String> tabHandler = new ArrayList<>(driver.getWindowHandles());
        tabHandler = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabHandler.get(tab));

    }
    public void scroll(int pixels){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+pixels+")", "");
        //js.executeScript("window.scrollBy(0,-2500)", "");
    }

}
