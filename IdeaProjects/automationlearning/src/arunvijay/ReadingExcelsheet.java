package arunvijay;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcelsheet {
    public static void main(String[] args) throws IOException {
        //File-->Workbook-->Sheets-->Rows-->Cells
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\excelsheet\\readingtask.xlsx");//C:\Users\admin\IdeaProjects\automationlearning\excelsheet\writingtask.xlsx
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet= workbook.getSheet("Sheet1");
        int totalRows=sheet.getLastRowNum();
        int totalCells=sheet.getRow(1).getLastCellNum();
        System.out.println(totalRows);
        System.out.println(totalCells);
        for(int i=0; i<=totalRows; i++)
        {
            XSSFRow currentRow= sheet.getRow(i);
            for(int j=0; j<totalCells;j++){
                XSSFCell cell=currentRow.getCell(j);
                System.out.print(cell);
            }
            System.out.println();
        }
        workbook.close();
    }
}
