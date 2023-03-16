package com.examination.sys.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.examination.sys.mapper.UserMapper;
import com.examination.sys.model.User;
import com.examination.sys.service.UserService;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 奕阳
 * @since 2023-03-15 11:55:14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    /**
     * 根据用户名查询登录
     *
     * @param username
     * @return
     */
    @Override
    public User login(String username, String password) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("username",username);
        userQueryWrapper.eq("password",password);
        return baseMapper.selectOne(userQueryWrapper);
    }
}
