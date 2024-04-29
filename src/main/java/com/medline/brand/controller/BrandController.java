package com.medline.brand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medline.brand.entity.Brand;
import com.medline.brand.service.BrandService;

@RestController
public class BrandController {
	
	@Autowired
	
	private BrandService brandservice;
	
	@PostMapping("/savebrand")
	public Brand saveBrand(@RequestBody Brand brand) {
		
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

}
