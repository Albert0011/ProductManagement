package com.achsat.travel.product.service;

import com.achsat.travel.product.model.TourPackage;
import com.achsat.travel.product.repository.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private TourPackageRepository tourPackageRepository;

    public TourPackage processTourPackage(Integer tourId){

    }


}
