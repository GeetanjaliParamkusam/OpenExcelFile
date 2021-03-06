package Reader;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

  private String inputFile;

  public void setInputFile(String inputFile) {
    this.inputFile = inputFile;
  }

  public void read() throws IOException  {
    File inputWorkbook = new File(inputFile);
    Workbook w;
    try {
      w = Workbook.getWorkbook(inputWorkbook);
      // Get the first sheet
      Sheet sheet1 = w.getSheet(0);
      // Loop over first 10 column and lines
     // Sheet sheet2 = w.getSheet(1);
      for (int j = 0; j < sheet1.getColumns(); j++) {
        for (int i = 0; i < sheet1.getRows(); i++) {
          Cell cell = sheet1.getCell(j, i);
          CellType type = cell.getType();
          if (type == CellType.LABEL) {
            System.out.println("I got a label " + cell.getContents());
          }

          if (type == CellType.NUMBER) {
            System.out.println("I got a number " + cell.getContents());
          }

        }
      }
    } catch (BiffException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws IOException {
    ReadExcel test = new ReadExcel();
    test.setInputFile("/home/ror/Desktop/OpenExcelFile/ExcelData.xls");
    test.read();
  }

} 
