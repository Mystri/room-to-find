package com.room.backend.service;

import com.room.backend.data._generated.entity.ApartmentsInfo;

import java.util.List;

public interface ApartmentService {

    ApartmentsInfo findApartmentByName(String name);

    List<ApartmentsInfo> findUserFavoriteApartment(Integer userId);

    ApartmentsInfo addApartment(ApartmentsInfo apartmentsInfo);

    void removeApartment(Integer apartmentId);

}
