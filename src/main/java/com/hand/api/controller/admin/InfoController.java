package com.hand.api.controller.admin;

import com.hand.api.service.UserService;
import com.hand.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class InfoController {

    @Autowired
    private UserService userService;

    @GetMapping("/admin/info")
    public String toInfo(Model model,HttpSession session){
        String userName = (String) session.getAttribute("loginUser");
        User user = new User();
        model.addAttribute("info",userService.finduser(user));
        return "admin/info";
    }
}
