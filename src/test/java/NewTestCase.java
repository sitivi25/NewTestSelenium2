import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewTestCase {
    @Test
    public void startDriver(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZenBook\\IdeaProjects\\NewTestSelenium2\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://mvnrepository.com/artifact/org.testng/testng");
    }

    @Test
    public void a(){
        String stroka = "это строка";
        int a = 2;
        boolean validate;

        System.out.println("Мы написали строку [" + stroka + "] " + a + " раз");

        a = 5;
        stroka = "jjjjjj";
        System.out.println("Мы написали строку [" + stroka + "] " + a + " раз");
        System.out.println("Мы написали строку [stroka] " + a + " раз");
        System.out.println(stroka);
        System.out.println("stroka");
    }
}