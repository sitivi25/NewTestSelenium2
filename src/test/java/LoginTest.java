import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    public String email_txt = "email@gg.y";
    public String password_txt = "password";
    public String rememberMeId;

    @Test
    public void OpenSignInPage() throws InterruptedException{
        homePage.takeMeToLoginPage();
    }

    @Test
    public void fillEmailAndPasswordFields() throws InterruptedException {
        homePage.takeMeToLoginPage();
        loginPage.fillUpCredentials(email_txt, password_txt, false);
    }

    @Test
    public void fillEmailAndPasswordFieldsAndValidateError() throws InterruptedException {
        homePage.takeMeToLoginPage();
        loginPage.fillEmailAndPasswordFieldsAndPressEnter();
        loginPage.displayError();
    }
}
