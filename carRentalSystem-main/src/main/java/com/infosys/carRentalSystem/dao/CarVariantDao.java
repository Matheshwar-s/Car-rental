package com.infosys.carRentalSystem.dao;
import java.util.List;

import com.infosys.carRentalSystem.bean.CarVariant;

public interface CarVariantDao{
	public void save(CarVariant carVariant);
	public String generateVariantId();
	public CarVariant findById(String id);
	public List<CarVariant> findAll();
	public void deleteVariantById(String id);
	public List<String> getAllVariantIds();
}