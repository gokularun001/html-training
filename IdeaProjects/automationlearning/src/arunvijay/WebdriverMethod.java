package arunvijay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //get methods we can access these methods through webdriver instance//all get methods perform webpage not webelement
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//launch URL
        //Thread.sleep(4000);
        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
       // String windowid=driver.getWindowHandle();
        //System.out.println(windowid);
        //driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
        //Set<String> windowids = driver.getWindowHandles();
        //System.out.println(windowids);

        //conditional methods access these commands through WebElement
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();
//        Thread.sleep(5000);
        // is displayed
//        WebElement logo=driver.findElement(By.xpath("//img"));
//        System.out.println(logo.isDisplayed());
//        boolean status=driver.findElement(By.xpath("//img")).isDisplayed();
//        System.out.println(status);
        //isEnabled()
//        boolean status=driver.findElement(By.xpath("//input[@type=\"text\"][@data-val-required=\"First name is required.\"]")).isEnabled();
//        System.out.println(status);
        //is Selected
        WebElement malerd=driver.findElement(By.xpath("//input[@type=\"radio\" and @value=\"M\"]"));
        malerd.click();
        System.out.println(malerd.isSelected());
        //browser methods
        //driver.close(); it will close single browser
        //driver.quit(); it will close multiple browsers
    }
}
