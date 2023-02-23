package com.zhang.controller;

import com.zhang.pojo.Character;
import com.zhang.service.ExcelExportService;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

@RestController
@RequestMapping("/excel")
public class ExcelExportController {

    @Autowired
    private ExcelExportService excelExportService;

    @RequestMapping("/export")
    public void export(HttpServletResponse response) throws IOException {
        List<Character> list = excelExportService.getExcelList();

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet();
        //添加表头
        Character character1 = new Character();
        Field[] declaredFields = character1.getClass().getDeclaredFields();
        Row row = sheet.createRow(0);
        for (int i = 0; i < declaredFields.length; i++) {
            Cell cell = row.createCell(i);
            cell.setCellValue(declaredFields[i].toString());
        }
        //添加数据
        for (int i = 1; i < list.size() + 1; i++) {
            Row row1 = sheet.createRow(i);
            Cell cellId = row1.createCell(0);
            cellId.setCellValue(list.get(i-1).getId());
            Cell cellName = row1.createCell(1);
            cellName.setCellValue(list.get(i-1).getName());
            Cell cellAge = row1.createCell(2);
            cellAge.setCellValue(list.get(i-1).getAge());
            Cell cellPhone = row1.createCell(3);
            cellPhone.setCellValue(list.get(i-1).getPhone());
            Cell cellAttribute = row1.createCell(4);
            cellAttribute.setCellValue(list.get(i-1).getAttribute());
        }
        response.setHeader("Content-Disposition","attachment;filename=测试导出.xlsx");
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=UTF-8");
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        outputStream.close();

    }
}
