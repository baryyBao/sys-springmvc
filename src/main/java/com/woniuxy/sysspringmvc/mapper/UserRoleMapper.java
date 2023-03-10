package com.woniuxy.sysspringmvc.mapper;

import com.woniuxy.sysspringmvc.domain.UserRole;

/**
* @author baosh1
* @description 针对表【sys_user_role】的数据库操作Mapper
* @createDate 2023-03-09 17:00:44
* @Entity com.woniuxy.rbac.domain.UserRole
*/
public interface UserRoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);

}
