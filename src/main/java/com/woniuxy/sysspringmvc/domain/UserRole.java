package com.woniuxy.sysspringmvc.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName sys_user_role
 */
@Data
public class UserRole implements Serializable {
    private Integer id;

    private Integer uid;

    private Integer rid;

    private static final long serialVersionUID = 1L;
}