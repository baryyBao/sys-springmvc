package com.woniuxy.sysspringmvc.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName sys_role
 */
@Data
public class Role implements Serializable {
    private Integer id;

    private String roleName;

    private static final long serialVersionUID = 1L;
}