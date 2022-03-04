package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManageServiceImpl implements UserManageService{

    @Autowired
    UserRepository repository;

    @Override
    public List<User> list() {
        return repository.list();
    }

    @Override
    public void register(User user) {
        repository.add(user);
    }

    @Override
    public User read(Integer userNo) {
        return repository.read(userNo);
    }

    @Override
    public void modify(User user) {
        repository.modify(user);
    }

    @Override
    public void remove(Integer userNo) {
        repository.remove(userNo);
    }

    @Override
    public boolean check(User user) {
        return repository.check(user);
    }
}
