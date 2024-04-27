package com.medline.brand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medline.brand.entity.Brand;
import com.medline.brand.repository.BrandRepository;

@Service
public class BrandService {
	
	@Autowired
	private BrandRepository brandrepositoy;
	
	public Brand saveBrand(Brand brand ) {
		
		return brandrepositoy.save(brand);
	}

}
