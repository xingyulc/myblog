package com.hand.api.service.impl;

import com.hand.api.service.UserService;
import com.hand.domain.entity.User;
import com.hand.infra.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User finduser(User user) {
        return userMapper.selectOne(user);
    }
}
