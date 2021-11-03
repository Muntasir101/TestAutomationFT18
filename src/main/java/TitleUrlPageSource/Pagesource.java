package TitleUrlPageSource;

import Base.TestBase;

public class Pagesource extends TestBase
{
    public static void main(String[] args) {
        chrome_Launch();
        openBaseURL("https://demo.opencart.com/");
        get_pageSource();
        close_Chrome();
    }

    public static void get_pageSource(){
       String PageSource= driver.getPageSource();
        System.out.println(PageSource);
    }
}
