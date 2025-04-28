package arunvijay;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExcelsheet {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"/src/excelsheet/writingtask.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("writingtask");
        XSSFRow row= sheet.createRow(0);
        row.createCell(0).setCellValue("Hulk");
        row.createCell(1).setCellValue("121");
        row.createCell(2).setCellValue("strongest avenger");

        XSSFRow row2= sheet.createRow(1);
        row2.createCell(0).setCellValue("thor");
        row2.createCell(1).setCellValue("122");
        row2.createCell(2).setCellValue("god of thunder");

        XSSFRow row3= sheet.createRow(2);
        row3.createCell(0).setCellValue("thanos");
        row3.createCell(1).setCellValue("123");
        row3.createCell(2).setCellValue("strongest villian");

        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("file is Written");
    }
}
