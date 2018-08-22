package com.hand.api.service;

import com.hand.domain.entity.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> list();
    Blog findById(Integer id);
    int insert(Blog blog);
    int update(Blog blog);
}
