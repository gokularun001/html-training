package arunvijay;

import net.bytebuddy.description.modifier.SynchronizationState;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import static com.google.common.util.concurrent.Futures.withTimeout;

public class WaitCommand {
    public static void main(String[] args) throws InterruptedException {
        //  Synchronization
        //1.implicit wait
        //2.explicit wait/fluent wait
        //NosuchElementsException-element is not present on the page.Synchronization.
        //ElementNotFoundException-locator is incorrect
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait
        WebDriverWait waitis = new WebDriverWait(driver, Duration.ofSeconds(10));//declaration and explicit wait
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        //Thread.sleep(4000);
        WebElement textcommt = waitis.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Username\"]")));
        textcommt.sendKeys("Arun");
        WebElement login = waitis.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        login.click();
        //driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Gokul");
        //fluent wait
//        Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver);
//                .withTimeout(Duration.ofSeconds(30))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class);
    }
}