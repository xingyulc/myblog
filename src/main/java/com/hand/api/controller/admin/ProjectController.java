package com.hand.api.controller.admin;

import com.hand.api.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/admin/project")
    public String toAdd(Model model){
        model.addAttribute("projects",projectService.list());
        return "admin/project";
    }
}
