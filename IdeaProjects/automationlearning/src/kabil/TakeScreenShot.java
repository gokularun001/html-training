package kabil;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakeScreenShot {
  @Test
    void ts() throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.com/");
    String  time = new SimpleDateFormat("yyMMdd_HHmmss").format(new Date());
    TakesScreenshot ts = (TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
      File target = new File(System.getProperty("user.dir")+"//ss//gokul"+time+".png");
     source.renameTo(target);
      Thread.sleep(2000);
    WebElement gg = driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]"));
    File sourcefile = gg.getScreenshotAs(OutputType.FILE);
    File targetfile = new File(System.getProperty("user.dir")+"//ss//gokul1"+time+".png");
    sourcefile.renameTo(targetfile);



  }
}
