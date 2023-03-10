package com.woniuxy.sysspringmvc.mapper;

import com.woniuxy.sysspringmvc.domain.Role;

/**
* @author baosh1
* @description 针对表【sys_role】的数据库操作Mapper
* @createDate 2023-03-09 17:00:44
* @Entity com.woniuxy.rbac.domain.Role
*/
public interface RoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

}
