package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GalleryPage extends BaseMain {

    public GalleryPage(ChromeDriver driver) {
        super(driver);
    }

    public String numberOfQuestionsLocator = "//div[@id='area-quiz-select']/div[@data-expertise-name='Development'][1]//div[@class='quiz-item-questions-count']";

    public String galleryPage = "https://test.my-fork.com/quizzes-list";
    private String ProgressBarUI = "//div[@class='quiz-process-progress-data']";

    public void verifyHorizontalMenu() {
        verifyHorizontalMenuCount(5);
        for (int i = 1; i < 6; i++) ;
        {
        }
    }
    public int verifyHorizontalMenuCount(int i) {
        By verifyHorizontalMenu = null;
        return driver.findElements(verifyHorizontalMenu).size();
    }
    public void openGalleryPage() {
        driver.get(galleryPage);
    }

    public String getTextOfTotalQuestions() {
        String totalText = driver.findElement(By.xpath(numberOfQuestionsLocator)).getText();
        System.out.println(totalText);
        return totalText;

    }
    public double doubleTotalQuestions(String totalText) {
        totalText = totalText.substring(4);
        double total = Double.parseDouble(totalText);
        System.out.println(total);
        return total;
    }
    public void clickOnStartButton(){
        driver.findElement(By.xpath("//div[@class='quiz-item-list-item new '][1]//div[@class='quiz-item-button']")).click();
    }
    public void selectAnswer(){
        driver.findElement(By.xpath("//div[@id='quiz-process-question-block-answers-block']/div[1]/div[1]")).click();
//        driver.findElement(By.xpath("//div[@class='quiz-process-question-block-answers-block-item '][1]")).click();
    }
    public String actualProgressValue (){
        String actualResult = driver.findElement(By.xpath(ProgressBarUI)).getText();
        actualResult = actualResult.substring(0,actualResult.indexOf("%"));
        return actualResult;
    }
    public String expectedProgressValue(double total, int answeredQuestions){
        double a = (answeredQuestions / total)*100;
        System.out.println(a);
        String expectedResult = String.valueOf(a);
        expectedResult = expectedResult.substring(0,expectedResult.indexOf("."));
        System.out.println(expectedResult);
        return expectedResult;
    }
    public void validateProgressBarValue(String actualResult, String expectedResult){
        Assert.assertEquals(actualResult, expectedResult);
    }
    public void clickNextPageButton(){
        driver.findElement(By.xpath("//div[@class='quiz-process-navigations-block-button-next ']")).click();
    }

}
