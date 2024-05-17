package com.medline.brand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medline.brand.entity.Brand;
import com.medline.brand.service.BrandService;

import jakarta.validation.Valid;

@RestController
public class BrandController {
	
	@Autowired
	
	private BrandService brandservice;
	
	@PostMapping("/savebrand")
	public Brand saveBrand(@RequestBody @Valid Brand brand) {
		
		return brandservice.saveBrand(brand);
	}
	
	
	@GetMapping("/getallbrands")
	
	public List<Brand> fetchBrandtList(){
		
		return brandservice.fetchBrandList();
	}
	
	@GetMapping("/getallbrands/{id}")
	
	public Brand fetchBrandBYID(@PathVariable("id") Long brandById) {
		return brandservice.fectchBrandById(brandById);
	}
		
	 @DeleteMapping("/brand/{id}")
	    public String deleteBrandById(@PathVariable("id") Long brandId) {
	       brandservice.deleteBrandtById(brandId);
	        return "Brand deleted Successfully!!";
	    }
	 
	// @PutMapping("/brand/{id}")
	 //public Brand updatedBrand(@PathVariable("id") Long brandId,@RequestBody Brand brand) {
		// return brandservice.updatedBrand(brandId,brand);
	// }

	 @GetMapping("/brand/name/{name}")
	 public Brand fetchBrandByName(@PathVariable("name") String brandName) {
	     return brandservice.fetchBrandByNameIgnoreCase(brandName);
	 }
}
