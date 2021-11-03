package Navigate;

import Base.TestBase;

public class Navigations extends TestBase {
    public static void main(String[] args) {
        chrome_Launch();
        openBaseURL("https://demo.opencart.com/");
        navigate_To();
        navigate_Back();
        navigate_Forward();
        close_Chrome();
    }

    public static void navigate_To(){
        driver.navigate().to("https://google.com");
        System.out.println("Navigate To Title:"+driver.getTitle()); //Google
    }
    public static void navigate_Back(){
        driver.navigate().back();
        System.out.println("Navigate Back Title:"+driver.getTitle()); //Opencart
    }
    public static void navigate_Forward(){
        driver.navigate().forward();
        System.out.println("Navigate Forward Title:"+driver.getTitle()); //Google
    }

}
