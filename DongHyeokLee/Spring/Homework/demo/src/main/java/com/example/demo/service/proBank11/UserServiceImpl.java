package com.example.demo.service.proBank11;

import com.example.demo.entity.proBank11.User;
import com.example.demo.entity.proBank11.UserCheck;
import com.example.demo.repository.proBank11.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository repository;

    @Override
    public void register(User user) {
        repository.create(user);

    }

    @Override
    public List<User> list() {
        return repository.list();
    }

    @Override
    public boolean login(UserCheck userCheck) {

        return repository.login(userCheck);
    }
}
