package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
    public static WebDriver driver;

    public static void chrome_Launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void openBaseURL(String URL) {
        driver.get(URL);
    }

    public static void close_Chrome(){
        driver.close();
    }

    public static void quit_Chrome(){
        driver.close();
    }

    public static void firefox_Launch(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
    }

    public static void close_Firefox(){
        driver.close();
    }

    public static void quit_Firefox(){
        driver.quit();
    }
}
