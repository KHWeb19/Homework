package com.example.demo.controller.proBank11;


import com.example.demo.entity.proBank11.User;
import com.example.demo.entity.proBank11.UserCheck;
import com.example.demo.service.proBank11.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/11th")
public class proBank11Controller {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(UserCheck userCheck){
        log.info("login");

        return "/11th/loginScreen";
    }

    @GetMapping("/register")
    public String registerForm(User user){
         log.info("registerForm");

         return "11th/register";
    }

    @PostMapping("/register")
    public String register(User user){
        log.info("registerForm");

        userService.register(user);

        return "11th/success";
    }

    @PostMapping("/login")
    public String mainPage(UserCheck userCheck) {
        log.info("login2");

        if(userService.login(userCheck)){
            return "11th/login";
        }else{
            return "11th/loginScreen";
        }

    }


}
