package com.zhang.service.serviceImpl;

import com.zhang.mapper.ExcelExportMapper;
import com.zhang.pojo.Character;
import com.zhang.service.ExcelExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExcelExportServiceImpl implements ExcelExportService {

    @Autowired
    private ExcelExportMapper excelExportMapper;

    @Override
    public List<Character> getExcelList() {
        return excelExportMapper.getExcelList();
    }
}
