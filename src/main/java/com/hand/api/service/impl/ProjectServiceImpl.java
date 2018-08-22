package com.hand.api.service.impl;

import com.hand.api.service.ProjectService;
import com.hand.domain.entity.Project;
import com.hand.infra.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectMapper projectMapper;
    @Override
    public List<Project> list() {
        return projectMapper.selectAll();
    }
}
