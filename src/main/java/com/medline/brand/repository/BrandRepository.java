package com.medline.brand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medline.brand.entity.Brand;

@Repository

public interface BrandRepository extends JpaRepository<Brand, Long>{

}
