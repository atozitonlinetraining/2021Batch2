package excel;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadExcel {

    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("ReadExcel.xlsx");
        Workbook wb= WorkbookFactory.create(fis);
        Sheet s=wb.getSheet("TestData");
        Row r=s.getRow(1);
        Cell c=r.getCell(0);
        String data=c.getStringCellValue();
        System.out.println(data);
        int lastrowNo=s.getLastRowNum();
        System.out.println(lastrowNo);
        for (int i=0;i<=lastrowNo;i++){
            Row r1= s.getRow(i);
            Cell c1=r1.getCell(0);
            String data1=c1.getStringCellValue();
            System.out.println(data1);
        }

        s.createRow(11).createCell(0).setCellValue("Navya");
        s.createRow(3).createCell(0).setCellValue("Rajesh");
        FileOutputStream fos=new FileOutputStream("ReadExcel.xlsx");
        wb.write(fos);
        fos.close();



    }
}
