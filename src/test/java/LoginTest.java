import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class LoginTest extends BaseTest {

    public String email_txt = "email@gg.y";
    public String password_txt = "password";

    @Test(priority = 3, groups = {"home"})
    public void OpenSignInPage() throws InterruptedException{
        homePage.takeMeToLoginPage();
    }

    @Test(priority = 1, groups = {"home"})
    public void fillEmailAndPasswordFields() throws InterruptedException {
        System.out.println("test 2");
        homePage.takeMeToLoginPage();
        loginPage.fillUpCredentials(email_txt, password_txt, false);
    }

    @Test(priority = 2, groups = {"feature"})
    public void fillEmailAndPasswordFieldsAndValidateError() throws InterruptedException {
        homePage.takeMeToLoginPage();
        loginPage.fillEmailAndPasswordFieldsAndPressEnter();
        loginPage.displayError();
    }
}
