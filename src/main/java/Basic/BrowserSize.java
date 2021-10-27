package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSize {
    public static WebDriver driver;

    public static void main(String[] args) {
        chrome_Launch();
        openURL();
        maximize_Browser();
        getWindowSize();
        setWindowSize();
        close_Chrome();
    }
    public static void chrome_Launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
    }
    public static void openURL(){
        driver.get("https://google.com");
    }

    public static void maximize_Browser(){
        driver.manage().window().maximize();
    }

    public static void getWindowSize(){
       int Width= driver.manage().window().getSize().getWidth();
       int Height=driver.manage().window().getSize().getHeight();
       System.out.println("Maximize Width: "+Width + " and" +" Maximize Height: " +Height);
    }

    public static void setWindowSize(){
        driver.manage().window().setSize(new Dimension(800, 400));
    }

    public static void close_Chrome(){
        driver.close();
    }

}
