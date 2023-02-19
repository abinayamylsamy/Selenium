import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class BasicWebElements {

    public static  String browser ="chrome";

    public  static WebDriver driver;


    public static void main(String[] args) {

        if (browser.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equals("Firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }


        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        String title = driver.getTitle();
        System.out.println(title);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

//        driver.navigate().to("http://google.com");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        List<WebElement> webElements =  driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div"));
        System.out.println(webElements);

        driver.navigate().to("http://www.sugarcrm.com");
        String windowHandles =  driver.getWindowHandle();

        driver.findElement(By.xpath("//*[@id=\"menu-item-21113\"]/a/span[1]")).click();
        Set <String> windowHandles1= driver.getWindowHandles();








    }



}
