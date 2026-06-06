
import java.io.File;
import java.io.IOException;
import java.nio.file.Files; // Use this instead of FileUtils
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
    public static void takeScreenshot(WebDriver driver, String fileName) {
        // TakesScreenshot
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        // Define the destination
        File destFile = new File("./" + fileName + ".png");
        
        try {
            Files.copy(srcFile.toPath(), destFile.toPath());
            System.out.println("Screenshot saved: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}