package xl;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteExample {

    public static void main(String[] args) {
//        try (Workbook workbook = new XSSFWorkbook()) {
//            Sheet sheet = workbook.createSheet("Sheet1");
//
//            Row headerRow = sheet.createRow(0);
//            Cell headerCell = headerRow.createCell(0);
//            headerCell.setCellValue("Name");
//
//            Row dataRow = sheet.createRow(1);
//            Cell dataCell = dataRow.createCell(0);
//            dataCell.setCellValue("John Doe");
//
//            try (FileOutputStream outputStream = new FileOutputStream("data.xlsx")) {
//                workbook.write(outputStream);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try{
            FileInputStream fileInputStream=new FileInputStream("D:/Bond/Whitelabel/MCIWL.xlsx");
            Workbook workbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet=workbook.getSheetAt(0);
            int NextRowNum = sheet.getPhysicalNumberOfRows();
            int colum=sheet.getRow(0).getPhysicalNumberOfCells();
            System.out.println(NextRowNum);
            System.out.println(colum);
            XSSFRow row = (XSSFRow) sheet.createRow(NextRowNum);
//            Row row = sheet.createRow(2);

            for(int col=0;col<colum;col++){
                row.createCell(col);
//                Cell cell = row.createCell(i);
            }
            row.getCell(0).setCellValue("hhh");
            Thread.sleep(1000);
            row.getCell(1).setCellValue("jkkk");
            Thread.sleep(1000);
            row.getCell(2).setCellValue("llll");
            Thread.sleep(1000);
            fileInputStream.close();
            try (FileOutputStream fileOut = new FileOutputStream("output.xlsx")) {
                workbook.write(fileOut);
                System.out.println("Excel file with rows created successfully!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
