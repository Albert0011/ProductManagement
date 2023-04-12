package com.achsat.travel.product.repository;

import com.achsat.travel.product.model.TourPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourPackageRepository extends CrudRepository<TourPackage, Integer> {

}
