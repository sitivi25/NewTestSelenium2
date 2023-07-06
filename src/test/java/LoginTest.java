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
        loginPage.fillEmailAndPasswordFieldsAndPressEnter();
        loginPage.displayError();
    }

    @Test
    public void fillEmailAndPasswordFieldsAndValidateCheckbox() throws InterruptedException {
        homePage.takeMeToLoginPage();
        //loginPage.checkifRememberMeIsSelected();
        System.out.println(driver.findElement(By.id(rememberMeId)).isSelected());
    }

    @Test
    public void verifyCheckboxTest () throws InterruptedException{
        homePage.takeMeToLoginPage();
        System.out.println(driver.findElement(By.xpath(rememberMeId)).getText());
    }
}
