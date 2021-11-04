package Frames;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesTest extends TestBase {
    public static void main(String[] args) {
        chrome_Launch();
        openBaseURL("https://the-internet.herokuapp.com/iframe");
        iFrameTest();
        close_Chrome();
    }
    public static void iFrameTest(){
        driver.switchTo().frame("mce_0_ifr");
        WebElement frameBody= driver.findElement(By.id("tinymce"));
        frameBody.clear();
        frameBody.sendKeys("Test Automation");
    }
}
