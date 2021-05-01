package nodump.noouchi;

import nodump.noouchi.cellinfogenerator.domain.excel.ExcelBook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

import static nodump.noouchi.cellinfogenerator.application.CellInfo.GetCellInfo;

public class CellInfo2Json {
    public static String getCellInfo(String excelFilePath) throws IOException {
        return GetCellInfo(new ExcelBook(excelFilePath));
    }

    public static String getCellInfo(XSSFWorkbook xssfWorkbook) throws IOException {
        return GetCellInfo(new ExcelBook(xssfWorkbook));
    }

}
