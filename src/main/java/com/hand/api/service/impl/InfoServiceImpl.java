package com.hand.api.service.impl;

import com.hand.api.service.InfoService;
import com.hand.domain.entity.Info;
import com.hand.domain.entity.User;
import com.hand.infra.mapper.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoMapper infoMapper;
    @Override
    public Info findByName(User user) {

        return null;
    }
}
