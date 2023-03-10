package com.woniuxy.sysspringmvc.mapper;

import com.woniuxy.sysspringmvc.domain.RolePermission;

/**
* @author baosh1
* @description 针对表【sys_role_permission】的数据库操作Mapper
* @createDate 2023-03-09 17:00:44
* @Entity com.woniuxy.rbac.domain.RolePermission
*/
public interface RolePermissionMapper {

    int deleteByPrimaryKey(Long id);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);

}
