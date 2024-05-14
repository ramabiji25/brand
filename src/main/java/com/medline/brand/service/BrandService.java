package com.medline.brand.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.medline.brand.entity.Brand;
import com.medline.brand.repository.BrandRepository;

@Service
public class BrandService {
	
	@Autowired
	private BrandRepository brandrepositoy;
	
	public Brand saveBrand(Brand brand ) {
		
		return brandrepositoy.save(brand);
	}

	public List<Brand> fetchBrandList() {
		// TODO Auto-generated method stub
		return brandrepositoy.findAll();
	}

	public Brand fectchBrandById(Long brandByID) {
		// TODO Auto-generated method stub
		return brandrepositoy.findById(brandByID).get();
	}

	public void deleteBrandtById(Long brandId) {
		// TODO Auto-generated method stub
		brandrepositoy.deleteById(brandId);
		
	}

	//public Brand updatedBrand(Long brandId, Brand brand) {
		// TODO Auto-generated method stub
		 // Brand braDB = brandrepositoy.findById(brandId).get();

	       // if(Objects.nonNull(brand.getBrand_name()) &&
	       // !"".equalsIgnoreCase(brand.getBrand_name())) {
	           // braDB.setBrand_name(brand.getBrand_name());
	       // }

	       // if(Objects.nonNull(brand.getBrandCode()) &&
	               // !"".equalsIgnoreCase(brand.getBrandCode())) {
	         //  braDB.setDepartmentCode(brand.getBrandCode());
	       // }

	       // if(Objects.nonNull(brand.getBrand_id()) &&
	               // !"".equalsIgnoreCase(brand.getBrand_id())) {
	          // braDB.setDepartmentAddress(brand.getBrandtAddress());
	       // }

	       // return brandrepositoy.save(braDB);
	    //}

	public Brand fetchBrandByName(String brandName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// // Update operation
    //@PutMapping("/brand/{id}")
 
   // public Brand
    //updateBrand(@RequestBody Brand brand,
                     //@PathVariable("id") Long brandId)
   // {
       // return brandService.updatebrand(
            //brand, brandId);
   //
	



public Brand fetchDepartmentByName(String brandName) {
    return brandrepositoy.findByBrandNameIgnoreCase(brandName);
}

public Brand fetchBrandByNameIgnoreCase(String brandName) {
	// TODO Auto-generated method stub
	return null;
}}
