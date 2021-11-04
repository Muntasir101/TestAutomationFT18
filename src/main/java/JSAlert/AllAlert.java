package JSAlert;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AllAlert extends TestBase {

    public static void main(String[] args) {

        chrome_Launch();
        openBaseURL("https://the-internet.herokuapp.com/javascript_alerts");
        normalAlert();
        confirmationAlert();
        promptAlert();
        close_Chrome();
    }
    public static void normalAlert(){

        WebElement normalAlertBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
        normalAlertBtn.click();

        driver.switchTo().alert().accept(); //click OK
    }
    public static void confirmationAlert(){
        WebElement confirmAlertBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        confirmAlertBtn.click();

        driver.switchTo().alert().dismiss(); //click on Cancel

    }
    public static void promptAlert(){
        WebElement promptAlertBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        promptAlertBtn.click();

        driver.switchTo().alert().sendKeys("Test Automation");
        driver.switchTo().alert().accept();
    }

}
