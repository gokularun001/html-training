package barat;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGPractis {
    WebDriver driver;


    @Test(priority = 1)
    void setUp(){
        System.out.println("checking login");
        driver = new ChromeDriver();

    }

    @Test(priority = 2)
    void loginTest(){
        System.out.println("checking homescreen");
        driver.get("https://www.google.com");
    }

    @Test(priority = 3)
    void closure(){
        System.out.println("checking payment");
        driver.quit();
    }
}
