package com.zhang.mapper;

import com.zhang.pojo.Character;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExcelExportMapper {

    @Select("select * from `character`")
    List<Character> getExcelList();
}
