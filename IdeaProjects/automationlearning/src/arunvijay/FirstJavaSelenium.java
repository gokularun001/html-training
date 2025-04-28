package arunvijay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FirstJavaSelenium{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //driver.manage().window().minimize();

        String title= driver.getTitle();
        System.out.println(title);
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("it's hero time");
        //
        // driver.quit();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@font-size=\"16px\"and@type=\"text\"and@placeholder=\"Try Saree, Kurti or Search by Product Code\"]")).sendKeys("Don't judge anyone");
        driver.quit();
    }
}
