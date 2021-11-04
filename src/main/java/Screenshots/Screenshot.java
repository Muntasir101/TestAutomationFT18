package Screenshots;

import Base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Screenshot extends TestBase {
    public static void main(String[] args) throws IOException {
        chrome_Launch();
        openBaseURL("https://google.com");
        generateScreenshot();
        close_Chrome();
    }

    public static void generateScreenshot() throws IOException {
        //Capture
        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //Save
        FileUtils.copyFile(srcFile,new File("./src/main/ScreenshotFiles/NewImage.png"),true);
    }
}
