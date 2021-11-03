package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
    public static WebDriver driver;

    public static void main(String[] args) {
        chrome_Launch();
        openLoginPage();
    }
    public static void chrome_Launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void openLoginPage(){
        driver.get("https://demo.opencart.com/");

        WebElement MyAccount= driver.findElement(By.linkText("My Account"));
        MyAccount.click();

        WebElement Login= driver.findElement(By.linkText("Login"));
        Login.click();
    }

    public static void close_Chrome(){
        driver.close();
    }

}
