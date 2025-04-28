package arunvijay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateandMonth {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frame);
        //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/06/2024");
        String year="2026";
        String month="June";
        String date="03";
        WebElement dob=driver.findElement(By.xpath("//input[@id='datepicker']"));
        dob.click();
        while(true){
            String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            String currentDate=driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-hover']")).getText();
            if(currentMonth.equals(month) && currentYear.equals(year) && currentDate.equals(date)){
                break;
            }
            else{
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }
        }
    }
}
