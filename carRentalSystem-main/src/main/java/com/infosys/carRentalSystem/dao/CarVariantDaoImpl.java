package com.infosys.carRentalSystem.dao;

import com.infosys.carRentalSystem.bean.CarVariant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class CarVariantDaoImpl implements CarVariantDao{
	
	@Autowired
	CarVariantRepository carVariantRepository;
	
	@Override
	public void save(CarVariant carVariant) {
		carVariantRepository.save(carVariant);
	}
	
	@Override
	public String generateVariantId() {
		int id=0;
		String val=carVariantRepository.getLastId();
		if(val==null) {
			id=10001;
		}
		else {
			id=Integer.parseInt(val.substring(1));
			id++;
		}
		String newId="V"+id;
		return newId;
	}
	
	@Override
	public CarVariant findById(String id) {
		return carVariantRepository.findById(id).get();
	}
	
	@Override
	public List<CarVariant> findAll(){
		return carVariantRepository.findAll();
	}
	
	@Override
	public void deleteVariantById(String id) {
		carVariantRepository.deleteById(id);
	}
	@Override
	public List<String> getAllVariantIds(){
		return carVariantRepository.getAllvariantIds();
	}
	
}