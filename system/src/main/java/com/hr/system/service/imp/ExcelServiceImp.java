package com.hr.system.service.imp;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.hr.system.service.IExcelService;
import com.hr.system.utils.StudentExcelModel;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;


@Service
public class ExcelServiceImp implements IExcelService {


    public void CreateExcel(String table, Integer index, Integer count) {
        try {
            OutputStream out = new FileOutputStream("C:\\Users\\tnie\\Desktop\\Document\\withHead.xlsx");
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            Sheet sheet1 = new Sheet(1, 0, StudentExcelModel.class);
            sheet1.setSheetName("sheet1");
            List<StudentExcelModel> data = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                StudentExcelModel item = new StudentExcelModel();
                item.setNum(i + 1);
                item.setName("name" + i);
                item.setSex("sex+" + i);
                item.setAddress("重庆" + i);
                item.setAge(i);
                data.add(item);
            }
            writer.write(data, sheet1);
            writer.finish();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
