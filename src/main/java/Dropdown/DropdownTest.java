package Dropdown;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest extends TestBase {
    public static void main(String[] args) {
        chrome_Launch();
        openBaseURL("https://the-internet.herokuapp.com/dropdown");
        DrpDwnTest();
        close_Chrome();
    }
    public static void DrpDwnTest(){
        WebElement drp=driver.findElement(By.id("dropdown"));
        Select obj=new Select(drp);
        obj.selectByValue("2");

       //  obj.selectByVisibleText("Option 2");

     //   obj.selectByIndex(2);

    }
}
