package com.achsat.travel.product.service;

import com.achsat.travel.product.model.TourPackage;
import com.achsat.travel.product.repository.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private TourPackageRepository tourPackageRepository;

    public TourPackage getTourPackage(Integer tourId) {
        Optional<TourPackage> tourPackageOptional = tourPackageRepository.findById(tourId);
        return tourPackageOptional.orElse(null);
    }

    public List<TourPackage> getAllTourPackage(){
        return (List<TourPackage>) tourPackageRepository.findAll();
    }
}
