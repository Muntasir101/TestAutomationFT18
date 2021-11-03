package TitleUrlPageSource;

import Base.TestBase;

public class TitleVerification extends TestBase
{
    public static void main(String[] args) {
        chrome_Launch();
        openBaseURL("https://demo.opencart.com/");
        title_Verify();
        close_Chrome();
    }

    public static void title_Verify(){
        String Expected_Title="Your Store";
        String Actual_Title= driver.getTitle();

        if(Expected_Title.equals(Actual_Title)){
            System.out.println("Title Matched. Test Pass.");
        }
        else {
            System.out.println("Title dose not Matched.Test failed.");
        }

    }
}
