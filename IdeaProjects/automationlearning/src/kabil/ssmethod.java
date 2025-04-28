package kabil;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ssmethod {
    void pic (WebDriver driver){
        TakesScreenshot ts = (TakesScreenshot) driver;
        String  time = new SimpleDateFormat("yyMMdd_HHmmss").format(new Date());
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir")+"//ss//gokul1234"+time+".png");
        source.renameTo(target);
    }
}
