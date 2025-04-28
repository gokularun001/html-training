package arunvijay;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        //simple Alerts
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id=\"accept\"]")).click();
        Alert alert=driver.switchTo().alert();
        String comment= alert.getText();
        System.out.println(comment);
        Thread.sleep(4000);
        alert.accept();
        //confirm Alert
        driver.findElement(By.xpath("//button[@id=\"confirm\"]")).click();
        driver.switchTo().alert();
        Thread.sleep(5000);
        alert.dismiss();
        //Prompt Alert
        driver.findElement(By.xpath("//button[@id=\"prompt\"]")).click();
        driver.switchTo().alert();
        alert.sendKeys("Gokul");
        alert.accept();
    }
}
