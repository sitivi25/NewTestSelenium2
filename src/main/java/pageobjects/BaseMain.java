package pageobjects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseMain{

    public ChromeDriver driver;
    public BaseMain(ChromeDriver driver){
        this.driver = driver;
    }

}
