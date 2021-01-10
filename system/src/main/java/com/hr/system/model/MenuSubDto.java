package com.hr.system.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MenuSubDto {

    private String subName;

    private String subIndexPath;

    private String subIconPath;

    private long subVisitPower;

    private long menuId;
}
