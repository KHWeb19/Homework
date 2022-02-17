package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserManageService {
    public List<User> list();
    public void register(User user);
    public User read(Integer userNo);
    public void modify(User user);
    public void remove(Integer userNo);
    public boolean check(User user);
}
