package TestNgBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTest {

    public static WebDriver driver;

    @BeforeClass
    public static void browser_setup(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }

    @DataProvider(name="LoginData")
    public Object[][] data(){
        Object [][] data=new Object[2][2];

        //set 1
        data [0][0]="mail@test.com";
        data [0][1]="123456";

        //set 2
        data [1][0]="test@test.com";
        data [1][1]="123456";

        return data;
    }

    @Test(dataProvider ="LoginData")
    public static void login_Tc(String dp_email,String dp_password) throws InterruptedException {
        WebElement Email=driver.findElement(By.id("input-email"));
        WebElement Password=driver.findElement(By.id("input-password"));
        WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));

        Email.clear();
        Email.sendKeys(dp_email);
        Thread.sleep(4000);
        Password.clear();
        Password.sendKeys(dp_password);
        Thread.sleep(4000);
        loginBtn.click();

        String Expected_Title="Account Login";
        String Actual_Title= driver.getTitle();

        if(Expected_Title.equals(Actual_Title)){
            System.out.println("Login UnSuccessful.login_Tc_02 Pass.");
        }
        else {
            System.out.println("Login Successful.login_Tc_02 failed.");
        }
    }

    @AfterClass
    public static void terDown(){
        driver.close();
    }
}
