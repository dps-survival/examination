package com.examination.sys.controller;


import com.examination.sys.model.User;
import com.examination.sys.service.UserService;
import com.examination.sys.util.Result;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 奕阳
 * @since 2023-03-15 11:55:14
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {
    @Resource
    UserService userService;

    @PostMapping("login")
    public Result login(@RequestBody User user){
        User login = userService.login(user.getUsername(), user.getPassword());
        if (ObjectUtils.isEmpty(user.getUsername()) || ObjectUtils.isEmpty(user.getPassword())){
            return Result.error("账号或密码不能为空，请重新输入");
        }
        if (login == null){
            return Result.error("账号或密码错误,请重新登录");
        }
        return Result.success();
    }
}

