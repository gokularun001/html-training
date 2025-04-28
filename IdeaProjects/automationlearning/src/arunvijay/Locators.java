package arunvijay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver gokul = new ChromeDriver();
        gokul.get("https://www.flipkart.com/");
        WebElement wb =gokul.findElement(By.id("themeColor"));
        System.out.println(wb.isDisplayed());
        WebElement wc =gokul.findElement(By.name("viewport"));
        System.out.println(wc.isDisplayed());
        WebElement wd= gokul.findElement(By.linkText("Mobiles"));
        System.out.println(wd.isDisplayed());
    }
}
