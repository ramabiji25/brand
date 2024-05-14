package com.medline.brand.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="brand")
public class Brand {
	
	
	@Id
	@Column(name="brand_id")
	private long brand_id;
	@Column(name="brand_name")
	@NotBlank(message = "Please Add Brand Name")
	private String brand_name;

}
