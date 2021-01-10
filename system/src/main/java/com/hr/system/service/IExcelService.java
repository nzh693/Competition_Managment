package com.hr.system.service;

public interface IExcelService {


    /**
     * 导出数据
     * @param table  表名
     * @param index  起始下标
     * @param count  数量
     */
    public void CreateExcel(String table,Integer index,Integer count);


}
