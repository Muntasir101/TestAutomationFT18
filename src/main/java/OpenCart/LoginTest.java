package OpenCart;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends TestBase {
    public static void main(String[] args) {
        chrome_Launch();
        openBaseURL("https://demo.opencart.com/index.php?route=account/login");
        login_Tc_01();
        login_Tc_02();
        login_Tc_03();
        login_Tc_04();
        close_Chrome();
    }
    //Email and pass valid
    public static void login_Tc_01(){
        WebElement Email=driver.findElement(By.id("input-email"));
        WebElement Password=driver.findElement(By.id("input-password"));
        WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));

        Email.clear();
        Email.sendKeys("user101@gmail.com");
        Password.clear();
        Password.sendKeys("123456");
        loginBtn.click();

        String Expected_Title="My Account";
        String Actual_Title= driver.getTitle();

        if(Expected_Title.equals(Actual_Title)){
            System.out.println("Login Successful.login_Tc_01 Pass.");
        }
        else {
            System.out.println("Login UnSuccessful.login_Tc_01 failed.");
        }

        //Logout
        WebElement Logout=driver.findElement(By.linkText("Logout"));
        Logout.click();

        WebElement MyAccount= driver.findElement(By.linkText("My Account"));
        MyAccount.click();

        WebElement Login= driver.findElement(By.linkText("Login"));
        Login.click();
    }

    //Email valid and pass Invalid
    public static void login_Tc_02(){
        WebElement Email=driver.findElement(By.id("input-email"));
        WebElement Password=driver.findElement(By.id("input-password"));
        WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));

        Email.clear();
        Email.sendKeys("user101@gmail.com");
        Password.clear();
        Password.sendKeys("123456dsfsdf");
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

    //Email Invalid and pass valid
    public static void login_Tc_03(){
        WebElement Email=driver.findElement(By.id("input-email"));
        WebElement Password=driver.findElement(By.id("input-password"));
        WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));

        Email.clear();
        Email.sendKeys("user101101010@gmail.com");
        Password.clear();
        Password.sendKeys("123456");
        loginBtn.click();

        String Expected_Title="Account Login";
        String Actual_Title= driver.getTitle();

        if(Expected_Title.equals(Actual_Title)){
            System.out.println("Login UnSuccessful.login_Tc_03 Pass.");
        }
        else {
            System.out.println("Login Successful.login_Tc_03 failed.");
        }
    }

    //Email and pass Invalid
    public static void login_Tc_04(){
        WebElement Email=driver.findElement(By.id("input-email"));
        WebElement Password=driver.findElement(By.id("input-password"));
        WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));

        Email.clear();
        Email.sendKeys("user101gmail.com");
        Password.clear();
        Password.sendKeys("1234");
        loginBtn.click();

        String Expected_Title="Account Login";
        String Actual_Title= driver.getTitle();

        if(Expected_Title.equals(Actual_Title)){
            System.out.println("Login UnSuccessful.login_Tc_04 Pass.");
        }
        else {
            System.out.println("Login Successful.login_Tc_04 failed.");
        }
    }
}
