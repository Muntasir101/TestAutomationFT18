package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsite {
    public static WebDriver driver;

    public static void main(String[] args) {
        chrome_Launch();
        open_OfflineURL();
       // close_Chrome();
    }
    public static void chrome_Launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
    }
    public static void openURL(){
        driver.get("https://google.com");
    }

    public static void open_OfflineURL(){
        driver.get("file:///F://Training//PeopleNTech//FT-18_Enamul//22th Class//Your Store.html");
    }
    public static void close_Chrome(){
        driver.close();
    }

}
