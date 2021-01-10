package com.hr.system.utils;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;


public class StudentExcelModel extends BaseRowModel {

    @ExcelProperty(value = "序号",index = 0)
    private Integer num;

    @ExcelProperty(value = "姓名",index = 1)
    private String name;


    @ExcelProperty(value = "性别",index = 3)
    private String sex;


    @ExcelProperty(value = "住址",index = 4)
    private String address;


    @ExcelProperty(value = "年龄",index = 5)
    private int age;


    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
