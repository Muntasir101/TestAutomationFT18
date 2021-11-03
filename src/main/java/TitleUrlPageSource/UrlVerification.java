package TitleUrlPageSource;

import Base.TestBase;

public class UrlVerification extends TestBase
{
    public static void main(String[] args) {
        chrome_Launch();
        openBaseURL("https://demo.opencart.com/");
        url_Verify();
        close_Chrome();
    }

    public static void url_Verify(){
        String Expected_URL="https://demo.opencart.com/";
        String Actual_URL= driver.getCurrentUrl();

        if(Expected_URL.equals(Actual_URL)){
            System.out.println("URL Matched. Test Pass. ");
        }
        else {
            System.out.println("URL dose not Matched.Test failed.");
        }

    }
}
