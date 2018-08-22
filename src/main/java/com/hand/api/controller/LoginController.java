package com.hand.api.controller;

import com.hand.api.service.UserService;
import com.hand.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }

    @PostMapping(value = "/admin/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session) {
        User user = new User();
        user.setUsername(username);
        System.out.println(user.toString());
        if (userService.finduser(user).getPassword().equals(password)){
            //登陆成功，防止表单重复提交，可以重定向到主页
            session.setAttribute("loginUser", username);
            return "redirect:/admin/blogs";
        } else {
            //登陆失败
            map.put("msg", "用户名密码错误");
            return "login";
        }
    }
}
