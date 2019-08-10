package test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelWrite {
    public static void main(String[] args) throws Exception{
        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;
        String path = "src/SampleData.xlsx";
        //it is opening and loading given path
        FileInputStream fileInputStream = new FileInputStream(path);
        workbook = new XSSFWorkbook(fileInputStream);//it is loading my file
        sheet=workbook.getSheet("Employees");

        //we select and save the row
        row = sheet.getRow(1);

        //selecting the cell from selected row
        cell = row.getCell(1);

        System.out.println("Last name is : "+cell.toString());
        XSSFCell cholponCell = sheet.getRow(2).getCell(0);
        System.out.println("Before : "+cholponCell.toString());
        cholponCell.setCellValue("Rose");

        //when we are sending a value to a file
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        //this line is executing and writing to the file
        workbook.write(fileOutputStream);

        System.out.println("After : "+cell.toString());
        //TODO: change Vildan's job id to princess dynamically
        for(int f = 0; f < sheet.getLastRowNum();f++){
            if(sheet.getRow(f).getCell(0).toString().equals("Vildan")){
                sheet.getRow(f).getCell(2).setCellValue("Princess");
            }
        }
        workbook.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
