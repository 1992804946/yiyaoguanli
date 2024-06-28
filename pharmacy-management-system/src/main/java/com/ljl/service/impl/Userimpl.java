package com.ljl.service.impl;

import com.ljl.mapper.UserMapper;
import com.ljl.pojo.medicine;
import com.ljl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<medicine> list() {
        return userMapper.list();
    }
   @Override
    public void delete(Integer id) {userMapper.deleteById(id);}

    @Override
    public void add(medicine medicine) {
        userMapper.insert(medicine);
    }
}
