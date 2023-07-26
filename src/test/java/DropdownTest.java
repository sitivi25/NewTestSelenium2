import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownTest extends BaseTest {
    public String websiteURL = "https://test.my-fork.com/register";

    @Test
    public void DropdownListHW() {
        driver.get(websiteURL);
        WebElement searchDropdownElement;
        searchDropdownElement = driver.findElement(By.xpath("//select[@id='job-title']"));
        Select searchDropdown = new Select(searchDropdownElement);
        List<WebElement> options;
        options = searchDropdown.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }
    }
}
