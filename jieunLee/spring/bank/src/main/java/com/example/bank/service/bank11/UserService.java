package com.example.bank.service.bank11;

import com.example.bank.entity.bank11.User;

import java.util.List;

public interface UserService {
    public void signUp (User user);
    public List<User> list ();
    public User read (Integer userNo);
    public void modify (User user);
    public void remove (Integer userNo);
    public boolean signIn (User user);
}
