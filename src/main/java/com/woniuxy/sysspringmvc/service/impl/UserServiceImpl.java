package com.woniuxy.sysspringmvc.service.impl;

import com.woniuxy.sysspringmvc.domain.User;
import com.woniuxy.sysspringmvc.domain.dto.UserDto;
import com.woniuxy.sysspringmvc.mapper.UserMapper;
import com.woniuxy.sysspringmvc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：barry
 * @date ：Created in 2023/3/9 17:18
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }

    @Override
    public User selectByTelAndPassword(UserDto userDto) {
        return userMapper.selectByTelAndPassword(userDto);
    }
}
