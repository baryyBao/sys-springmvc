package com.woniuxy.sysspringmvc.mapper;

import com.woniuxy.sysspringmvc.domain.Permission;

/**
* @author baosh1
* @description 针对表【sys_permission】的数据库操作Mapper
* @createDate 2023-03-09 17:00:44
* @Entity com.woniuxy.rbac.domain.Permission
*/
public interface PermissionMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

}
