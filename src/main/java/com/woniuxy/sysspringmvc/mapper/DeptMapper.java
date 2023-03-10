package com.woniuxy.sysspringmvc.mapper;

import com.woniuxy.sysspringmvc.domain.Dept;

/**
* @author baosh1
* @description 针对表【sys_dept】的数据库操作Mapper
* @createDate 2023-03-09 17:00:44
* @Entity com.woniuxy.rbac.domain.Dept
*/
public interface DeptMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

}
