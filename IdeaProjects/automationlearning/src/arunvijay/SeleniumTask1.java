package arunvijay;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v130.page.model.Screenshot;
import org.openqa.selenium.devtools.v85.headlessexperimental.model.ScreenshotParams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SeleniumTask1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/Properties/task1proptery.properties");
        Properties prop = new Properties();
        prop.load(file);

        driver.get(prop.getProperty("googleURL"));
        driver.manage().window().maximize();
        FileInputStream excelfile= new FileInputStream(System.getProperty("user.dir")+"/src/excelsheet/searchtask.xlsx");
        XSSFWorkbook workbook= new XSSFWorkbook(excelfile);
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        int cellnumbers = sheet.getRow(0).getLastCellNum() - 1;

        System.out.println(cellnumbers);

        for(int i =0 ; i<=cellnumbers; i++){
            String cellvalue = sheet.getRow(0).getCell(i).toString();
            driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]")).click();
            driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]")).clear();
            driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]")).sendKeys(cellvalue);
        }


       // workbook.close();
       // driver.quit();
    }
}
