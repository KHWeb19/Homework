package com.example.demo.service.proBank11;


import com.example.demo.entity.proBank11.User;
import com.example.demo.entity.proBank11.UserCheck;

import java.util.List;

public interface UserService {
    public void register (User user);
    public List<User> list();
    public boolean login(UserCheck userCheck);

}
