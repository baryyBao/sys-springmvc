package com.woniuxy.sysspringmvc.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName sys_role_permission
 */
@Data
public class RolePermission implements Serializable {
    private Integer id;

    private Integer rid;

    private Integer perId;

    private static final long serialVersionUID = 1L;
}