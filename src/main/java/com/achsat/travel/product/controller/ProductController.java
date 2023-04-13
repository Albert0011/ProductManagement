package com.achsat.travel.product.controller;

import com.achsat.travel.product.model.TourPackage;
import com.achsat.travel.product.service.ProductService;
import com.achsat.travel.product.utility.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<BaseResponse<TourPackage>> getTourPackage(@PathVariable("id") String packageId){
        TourPackage tourPackage = productService.getTourPackage(Integer.valueOf(packageId));
        BaseResponse<TourPackage> response = new BaseResponse<TourPackage>();
        response.setPayload(tourPackage);
        if (tourPackage == null){
            response.setErrorCode("31");
            response.setErrorMessage("No package available to retrieve.");
        } else {
            response.setErrorCode("00");
            response.setErrorMessage("Success");
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<BaseResponse<List<TourPackage>>> getAllTourPackage(){
        List<TourPackage> tourPackages = productService.getAllTourPackage();
        BaseResponse<List<TourPackage>> response = new BaseResponse<List<TourPackage>>();
        response.setPayload(tourPackages);
        if (tourPackages.isEmpty()){
            response.setErrorCode("31");
            response.setErrorMessage("No tour package available at the moment.");
        } else {
            response.setErrorCode("00");
            response.setErrorMessage("Success");
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
