package arunvijay;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://text-compare.com/");
        //driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@name=\"text1\"]")).sendKeys("I am coming");
        Actions action =new Actions(driver);
        //WebElement slider=driver.findElement(By.xpath("//div[@class='ui-slider-range ui-corner-all ui-widget-header']"));
        //System.out.println(slider.getLocation());
        //action.dragAndDropBy(slider,200 , 297).perform();
        action.keyDown(Keys.CONTROL).perform();
        action.sendKeys("A").perform();
        action.keyUp(Keys.CONTROL).perform();
        action.keyDown(Keys.CONTROL).perform();
        action.sendKeys("C").perform();
        action.keyUp(Keys.CONTROL).perform();
        action.keyDown(Keys.CONTROL).perform();
        action.sendKeys("V").perform();
        action.keyUp(Keys.CONTROL).perform();
        action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
    }
}
