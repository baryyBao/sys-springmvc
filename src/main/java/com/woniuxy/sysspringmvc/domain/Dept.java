package com.woniuxy.sysspringmvc.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName sys_dept
 */
@Data
public class Dept implements Serializable {
    private Integer id;

    private String deptName;

    private static final long serialVersionUID = 1L;
}