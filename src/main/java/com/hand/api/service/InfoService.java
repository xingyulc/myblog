package com.hand.api.service;

import com.hand.domain.entity.Info;
import com.hand.domain.entity.User;

import javax.servlet.http.HttpSession;

public interface InfoService {
    Info findByName(User user);
}
