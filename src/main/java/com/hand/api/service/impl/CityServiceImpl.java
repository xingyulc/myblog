package com.hand.api.service.impl;

import com.hand.api.service.CityService;
import com.hand.domain.entity.City;
import com.hand.infra.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public City findById(Short cityId) {
        City city = new City();
        city.setCityId(cityId);
        return cityMapper.selectOne(city);
    }
}
