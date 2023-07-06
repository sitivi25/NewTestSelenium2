package pageobjects;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BaseMain {

    public LoginPage(ChromeDriver driver) {
        super(driver);
    }

    public String emailTxtField = "//input[@id='email']";
    public By passwordInput = By.xpath("//input[@id='password']");
    public String email_txt = "email@gg.y";
    public String password_txt = "password";
    public String error = "//div[@class='test-login-errors']";
    protected String signInBtn = "//div[@id='loginButton']/button";
    boolean rememberMe;

    public void fillUpCredentials(String email, String password, boolean rememberMe) {
        driver.findElement(By.xpath(emailTxtField)).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        if (rememberMe) {
            driver.findElement(By.id("remember")).click();
            submitCredentials();
        }    else {
            submitCredentials();
        }

    }

    public void fillEmailAndPasswordFieldsAndPressEnter() throws InterruptedException {
        fillUpCredentials(email_txt, password_txt);
        driver.findElement(passwordInput).sendKeys(Keys.ENTER);
    }

    private void fillUpCredentials(String emailTxt, String passwordTxt) {
    }

    public void displayError() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath(error)).isDisplayed());
    }

    public void submitCredentials() {
        driver.findElement(By.xpath(signInBtn)).submit();
    }
}

