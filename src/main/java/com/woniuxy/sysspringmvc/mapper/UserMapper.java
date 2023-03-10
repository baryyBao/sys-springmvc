package com.woniuxy.sysspringmvc.mapper;

import com.woniuxy.sysspringmvc.domain.User;
import com.woniuxy.sysspringmvc.domain.dto.UserDto;

/**
* @author baosh1
* @description 针对表【sys_user】的数据库操作Mapper
* @createDate 2023-03-09 17:00:44
* @Entity com.woniuxy.rbac.domain.User
*/
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User  selectByTelAndPassword(UserDto userDto);

}
