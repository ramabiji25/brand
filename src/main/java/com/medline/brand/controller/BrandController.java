package com.medline.brand.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	

}
