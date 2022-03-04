package com.example.bank.service.bank11;

import com.example.bank.entity.bank11.User;
import com.example.bank.repository.bank11.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository repository;

    @Override
    public void signUp(User user) {
        repository.create(user);
    }

    @Override
    public List<User> list() {
        return repository.list();
    }

    @Override
    public User read(Integer userNo) {
        return repository.read(userNo);
    }

    @Override
    public void modify(User user) {
        repository.update(user);
    }

    @Override
    public void remove(Integer userNo) {
        repository.delete(userNo);
    }

    @Override
    public boolean signIn(User user) {
        if (repository.signIn(user.getUserId())==null) {
            return false;
        }
        if (!repository.signIn(user.getUserId()).getUserPassword().equals(user.getUserPassword())) {
            return false;
        }
        return true;
    }
}
