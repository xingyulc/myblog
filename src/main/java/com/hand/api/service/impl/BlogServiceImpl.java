package com.hand.api.service.impl;

import com.hand.api.service.BlogService;
import com.hand.domain.entity.Blog;
import com.hand.infra.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public int insert(Blog blog) {
        return blogMapper.insertSelective(blog);
    }

    @Override
    public int update(Blog blog) {
        return blogMapper.updateByPrimaryKey(blog);
    }

    @Override
    public List<Blog> list() {
        return blogMapper.selectAll();
    }

    @Override
    public Blog findById(Integer id) {
       Blog blog = new Blog();
       blog.setVid(id);
        return blogMapper.selectByPrimaryKey(blog);
    }
}
