package com.hr.system;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.hr.system.po.StudentPo;
import com.hr.system.repository.StudentRepository;
import com.hr.system.service.IExcelService;
import com.hr.system.service.imp.FileServiceImp;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
class SystemApplicationTests {


    @Autowired
    private FileServiceImp fileServiceImp;


    @Autowired
    private IExcelService excelService;


    @Autowired
    private StudentRepository repository;




//    @Test
//    void contextLoads() {
//        File file = new File("C:\\Users\\tnie\\Desktop\\文件上传\\SaveFile\\Document\\笔记\\SpringCloud\\springcloud基础.md");
//        fileServiceImp.uploadOnServer(file);
//    }


    @Test
    public void writeWithoutHead() throws IOException {
        try (OutputStream out = new FileOutputStream("C:\\Users\\tnie\\Desktop\\Document\\withoutHead.xlsx")) {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, false);
            Sheet sheet1 = new Sheet(1, 0);
            sheet1.setSheetName("sheet1");
            List<List<String>> data = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                List<String> item = new ArrayList<>();
                item.add("item0" + i);

                item.add("item1" + i);
                item.add("item2" + i);
                data.add(item);
            }
            writer.write0(data, sheet1);
            writer.finish();
        }
    }


    @Test
    public void writeWithHead() throws IOException {
        excelService.CreateExcel("student",1,20);
    }

    @Test
    public void testMongoFind() {
        List<StudentPo> students = repository.findAll();
        System.out.println("********** "+students.size());
        for (StudentPo student : students) {
            System.out.println(student);
        }
    }



}
