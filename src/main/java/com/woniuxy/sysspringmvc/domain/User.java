package com.woniuxy.sysspringmvc.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName sys_user
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String password;

    private String tel;

    private String realName;

    private Date birthday;

    private String headImg;

    private Integer status;

    private Integer deptId;

    private static final long serialVersionUID = 1L;
}