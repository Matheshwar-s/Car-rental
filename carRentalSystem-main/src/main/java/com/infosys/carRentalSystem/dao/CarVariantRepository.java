package com.infosys.carRentalSystem.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.infosys.carRentalSystem.bean.CarVariant;
public interface CarVariantRepository extends JpaRepository<CarVariant,String>{
	@Query("SELECT max(cv.variantId) from CarVariant cv")
	public String getLastId();
	
	@Query("select variantId from CarVariant")
	public List<String> getAllvariantIds();
}