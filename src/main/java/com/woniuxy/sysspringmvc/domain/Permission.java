package com.woniuxy.sysspringmvc.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName sys_permission
 */
@Data
public class Permission implements Serializable {
    private Integer id;

    private Integer pid;

    private String percode;

    private String type;

    private String name;

    private String icon;

    private String href;

    private Integer open;

    private static final long serialVersionUID = 1L;
}