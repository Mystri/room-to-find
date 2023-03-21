package com.room.backend.data.mapper;

import com.room.backend.data._generated.entity.ApartmentsInfo;

import java.util.List;

public interface CustomUserMapper {
    List<ApartmentsInfo> getApartmentsInfoByUserId(Integer id);
}
