import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class EndToEnd extends BaseTest{

    public String email = "testing@my-fork.com";
    public String password = "Password";
    public String websiteURL = "https://test.my-fork.com/";
    public String galleryURL = "https://test.my-fork.com/quizzes-list";
    private String ProgressBarUI = "//div[@class='quiz-process-progress-data']";


    @Test
    public void history() throws InterruptedException{
        driver.get(galleryURL);
        List<WebElement> history = driver.findElements(By.xpath("//a[@class='quiz-section-history-button']"));
        Assert.assertEquals(history.size(), 0);
        driver.get(websiteURL);
        homePage.takeMeToLoginPage();
        loginPage.fillUpCredentials(email, password, false);
        driver.get(galleryURL);
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='quiz-section-history-button']")).isDisplayed());
        System.out.println();
    }
    @Test
    public void verifyHorizontalMenuCount() {
        driver.get(galleryURL);
        List<WebElement> menu = driver.findElements(By.xpath("//div[@class='expertise-areas-list']/div"));
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i).getText());
            Assert.assertEquals(menu.size(), 5);
        }
    }
    @Test
    public void quizProgressBar(){
        homePage.openHomePage();
        galleryPage.openGalleryPage();
        String totalText = galleryPage.getTextOfTotalQuestions();
        double total = galleryPage.doubleTotalQuestions(totalText);
        System.out.println(total);
        galleryPage.clickOnStartButton();
        baseMain.switchTo(1);
        galleryPage.selectAnswer();
        String actualResult = galleryPage.actualProgressValue();
        String expectedResult = galleryPage.expectedProgressValue(total, 1);
        galleryPage.validateProgressBarValue(actualResult, expectedResult);
        galleryPage.clickNextPageButton();
        actualResult = galleryPage.actualProgressValue();
        expectedResult = galleryPage.expectedProgressValue(total, 1);
        galleryPage.validateProgressBarValue(actualResult, expectedResult);
        galleryPage.selectAnswer();
        actualResult = galleryPage.actualProgressValue();
        expectedResult = galleryPage.expectedProgressValue(total, 2);
        galleryPage.validateProgressBarValue(actualResult, expectedResult);
    }
}
