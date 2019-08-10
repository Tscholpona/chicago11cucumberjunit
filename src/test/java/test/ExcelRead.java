package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelRead {
    public static void  main(String[] args)throws Exception{
        //creating a file from java.io
       File file =new File("src/SampleData.xlsx");
        System.out.println(file.exists());//it will return true if it exists, false if does not
        FileInputStream fileInputStream = new FileInputStream(file);//is used for loading file into java memory, we can read and write
        //workbook  -- Sheet--Rows --Cells
        //Loading the workbook to our class
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);

        //pass the sheet
        XSSFSheet sheet = workbook.getSheet("Employees");

       // this line is getting  from employees sheet
        System.out.println(sheet.getRow(2).getCell(1));

        //method counts only used cell, if there are some cells that are not used, they will be not counted,
        //it starts couting from 1
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println("getPhysicalNumberOfRows: "+usedRows);

        //this method counts from top to buttom, does
        // not care if empty cell or used cell, starts from 0
        int lastUsedRow = sheet.getLastRowNum();
        System.out.println("getLastRowNumber: "+lastUsedRow);

        //TODO: Create a logic that prints out Hannamaria name dynamically
        for(int i =0; i < usedRows;i++){
            if(sheet.getRow(i).getCell(0).toString().equals("Hannamaria")){
                System.out.println(sheet.getRow(i).getCell(0));
            }
        }
        //Todo: create a logic that prints yaseen name ID dynamically
        for (int rowNum=0; rowNum<usedRows; rowNum++){
            if(sheet.getRow(rowNum).getCell(0).toString().equalsIgnoreCase("Yaseen")){
                System.out.println("Job ID Of Yaseen" +sheet.getRow(rowNum).getCell(2));
            }
        }
        workbook.close();
        fileInputStream.close();



    }

}
