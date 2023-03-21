package com.room.backend.service.impl;

import com.room.backend.data._generated.entity.ApartmentsInfo;
import com.room.backend.data._generated.mapper.ApartmentsInfoMapper;
import com.room.backend.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ApartmentService")
public class ApartmentServiceImpl implements ApartmentService {

    @Autowired
    ApartmentsInfoMapper apartmentsInfoMapper;

    @Override
    public ApartmentsInfo findApartmentByName(String name) {
        return null;
    }

    @Override
    public List<ApartmentsInfo> findUserFavoriteApartment(Integer userId) {
        return null;
    }

    @Override
    public ApartmentsInfo addApartment(ApartmentsInfo apartmentsInfo) {
        return null;
    }

    @Override
    public void removeApartment(Integer apartmentId) {

    }
}
