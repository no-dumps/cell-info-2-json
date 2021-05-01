package nodump.noouchi.cellinfogenerator.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import nodump.noouchi.cellinfogenerator.domain.excel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CellInfo {
    public static String GetCellInfo(ExcelBook excelBook) throws JsonProcessingException {
        List<String> sheetNames = excelBook.getSheetNames();
        ArrayList<ExcelInfo> result = new ArrayList<>();
        XSSFWorkbook workbook = excelBook.getWorkbook();
        for (String sheetName :
                sheetNames
        ) {
            ExcelSheet excelSheet = new ExcelSheet(workbook, sheetName);

            ArrayList<ExcelCellInfo> cellInfos = ExcelSheetService.getAllCellInfo(excelSheet.getSheet());
            ExcelInfo excelInfo = new ExcelInfo(sheetName, cellInfos);
            result.add(excelInfo);
        }
        if (result.size() > 0) {
            ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
            // TODO want to format list.
            // return json
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
        } else {
            return "";
        }
    }

    private static String getFileName(final String fullPathString) {
        File file = new File(fullPathString);
        String basename = file.getName();
        return basename.substring(0, basename.lastIndexOf('.'));
    }
}