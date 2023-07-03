import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class JavaOOP extends JavaBAM {
    String url = "https://test.my-fork.com/";
    String urlLogin = "https://test.my-fork.com/login";
    String emailfield = "//input[@id='email']";
    String passwordfield = "//input[@id='password']";
    String loginbutton = "//div[@id='loginButton']/button";
    String loginerrortext = "//div[@class='test-login-errors']";
    String loginbuttonlink = "//a[@class='menu-item log-in-button']";
    String checkbox = "auth-page-remember-me";


    @Test
    public void verifyCheckbox() throws InterruptedException {
        driver.get(urlLogin);
        System.out.println(driver.findElement(By.id(checkbox)).isSelected());

    }
    @Test
    public void verifylogin(){
        driver.get(urlLogin);
        driver.findElement(By.xpath(emailfield)).sendKeys("email@gg.y");
        driver.findElement(By.xpath(passwordfield)).sendKeys("password");
        driver.findElement(By.xpath(loginbutton)).sendKeys(Keys.ENTER);

    }

    @Test
    public void validateInvalid() throws InterruptedException {
        driver.get(urlLogin);
        driver.findElement(By.xpath(emailfield)).sendKeys("email@gg.y");
        driver.findElement(By.xpath(passwordfield)).sendKeys("password");
        driver.findElement(By.xpath(loginbutton)).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath(loginerrortext)).isDisplayed());

    }
    @Test
    public void login() {
        driver.get(url);
        driver.findElement(By.xpath(loginbuttonlink)).click();
    }
    @Test
    public void trueValidate(){
        driver.get(urlLogin);
        System.out.println(driver.findElement(By.xpath(emailfield)).isDisplayed());
        System.out.println(driver.findElement(By.xpath(passwordfield)).isDisplayed());
        System.out.println(driver.findElement(By.xpath(loginbutton)).isDisplayed());

    }
    @Test
    public void website() {
        driver.get(url);
    }
}
