package com.examination.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.examination.sys.model.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 奕阳
 * @since 2023-03-15 11:55:14
 */
public interface UserService extends IService<User> {

    /**
     *  根据用户名查询登录
     * @param username,password
     * @return
     */
    User login(String username, String password);
}
