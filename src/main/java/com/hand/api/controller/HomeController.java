package com.hand.api.controller;

import com.hand.api.service.BlogService;
import com.hand.domain.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("blogs",blogService.list());
        return "font/index";
    }

    @GetMapping("/article/{id}")
    public String articleShow(@PathVariable("id") Integer id,Model model){
        Blog blog = blogService.findById(id);
        model.addAttribute("blog",blog);
        System.out.println(blog.toString());
        return "font/article";
    }
}
