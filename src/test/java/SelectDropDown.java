import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class SelectDropDown {

    public static void main(String[] args) {

            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();



        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        WebElement dropDown = driver.findElement(By.name("employees_c"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("test");












    }



}
