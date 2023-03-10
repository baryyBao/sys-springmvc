package com.woniuxy.sysspringmvc.controller;

import com.woniuxy.sysspringmvc.domain.User;
import com.woniuxy.sysspringmvc.domain.dto.UserDto;
import com.woniuxy.sysspringmvc.service.UserService;
import com.woniuxy.sysspringmvc.util.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：barry
 * @date ：Created in 2023/3/9 17:19
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@RequestMapping("users")
public class UserController {
    @Resource
    private UserService userService;
    @PostMapping("loginDo")
    public Result login(@RequestBody UserDto userDto){
        User user = userService.selectByTelAndPassword(userDto);
        if (user != null) {
            return Result.ok();
        }else {
            return Result.error("密码或账号错误!");
        }
    }
}
