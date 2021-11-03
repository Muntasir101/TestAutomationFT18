package BrowserOption;

import Base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTest {
    public static WebDriver driver;

    public static void main(String[] args) {
        chrome_Headless();

    }
    public static void chrome_Headless(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        ChromeOptions obj=new ChromeOptions();
        obj.setHeadless(true);
        driver=new ChromeDriver(obj);
        driver.manage().window().maximize();

        driver.get("https://demo.opencart.com");

        String Expected_Title="Your Store";
        String Actual_Title= driver.getTitle();

        if(Expected_Title.equals(Actual_Title)){
            System.out.println("Title Matched. Test Pass.");
        }
        else {
            System.out.println("Title dose not Matched.Test failed.");
        }
        driver.close();
    }

}
