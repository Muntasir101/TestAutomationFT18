package MulipleTab;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class BrowserTab {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //Scroll down
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");

        WebElement Twitter= driver.findElement(By.cssSelector("#social-icons > a:nth-child(3) > img"));
        Twitter.click();

        Set<String> handles= driver.getWindowHandles();

        Iterator<String> it= handles.iterator();
        String parentWindow=it.next();
        String childWindow=it.next();

        //Switching to Parent
        driver.switchTo().window(parentWindow);
        System.out.println("ParentWindow Title:"+driver.getTitle());

        //Switching to Child
        driver.switchTo().window(childWindow);
        System.out.println("childWindow Title:"+driver.getTitle());

       driver.quit();
    }

}

