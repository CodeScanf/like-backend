package com.xiaoli.like.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoli.like.mapper.UserMapper;
import com.xiaoli.like.model.entity.User;
import com.xiaoli.like.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author xiaoli
* @description 针对表【user】的数据库操作Service实现
* @createDate 2025-11-23 17:13:26
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




