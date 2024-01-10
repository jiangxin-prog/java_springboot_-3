package org.example.service.impl;

import org.example.dto.UserDataDTO;
import org.example.entity.User;
import org.example.mapper.UserMapper;
import org.example.service.IUserService;
import org.example.vo.UserDataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDataVO> getUserList(UserDataDTO requestDto) {
        return userMapper.getUserList(requestDto);
    }

    @Override
    public Boolean insetUser(User user) {
        return userMapper.insetUser(user) > 0;
    }

    @Override
    public Boolean insetUsers(List<User> users) {
        return userMapper.insetUsers(users) > 0;
    }

    @Override
    public Boolean updUser(User user) {
        return userMapper.updUser(user) > 0;
    }

    @Override
    public int delUser(Integer id) {
        return userMapper.delUser(id);
    }

    public UserDataVO getUserDetail(Integer id) {
        return userMapper.getUserDetail(id);
    }
}
