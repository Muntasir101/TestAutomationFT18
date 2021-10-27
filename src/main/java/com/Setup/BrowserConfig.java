package com.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfig {
   public static WebDriver driver;

    public static void main(String[] args) {
        chrome_Launch();
        quit_Chrome();
        firefox_Launch();
        quit_Firefox();
    }

    public static void chrome_Launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
    }

    public static void close_Chrome(){
        driver.close();
    }

    public static void quit_Chrome(){
        driver.close();
    }

    public static void firefox_Launch(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
    }

    public static void close_Firefox(){
        driver.close();
    }

    public static void quit_Firefox(){
        driver.quit();
    }
}
