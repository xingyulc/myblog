package com.hand.api.controller.admin;

import com.hand.api.service.BlogService;
import com.hand.domain.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("admin/blog")
    public String add() {
        return "admin/blog_add";
    }

    @GetMapping("admin/blogs")
    public String list(Model model){
//        model.addAttribute("current",page);
//        model.addAttribute("pageNum",blogSer.GetPageNum());
        model.addAttribute("blogList",blogService.list());
        return "admin/blog_list";
    }


    @GetMapping("blog/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model){
        Blog blog = blogService.findById(id);
        model.addAttribute("blog",blog);
        return "admin/blog_modify";
    }

    @PostMapping("/admin/post.action")
    public String add(@ModelAttribute("blogForm") Blog blog, Model model){
        blogService.insert(blog);
        return "redirect:/admin/blogs";
    }
    @PostMapping("admin/update.action")
    public String update(Blog blog){
        blog.setDate(new Date());
        System.out.println("***************************");
        System.out.println(blog.toString());
        blogService.update(blog);
        return "redirect:/admin/blogs";
    }
}
