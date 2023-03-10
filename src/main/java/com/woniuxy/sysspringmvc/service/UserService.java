package com.woniuxy.sysspringmvc.service;

import com.woniuxy.sysspringmvc.domain.User;
import com.woniuxy.sysspringmvc.domain.dto.UserDto;

public interface UserService {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User  selectByTelAndPassword(UserDto userDto);
}
