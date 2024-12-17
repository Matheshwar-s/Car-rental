package com.infosys.carRentalSystem.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.infosys.carRentalSystem.bean.Car;
@Service
@Repository
public class CarDaoImpl implements CarDao{

	@Autowired
	private CarRepository repository;
	@Override
    public void save(Car car) {
        repository.save(car);
    }
	@Override
    public void deleteVariantById(String id) {
        
        }
	

	@Override
	public Car findById(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void deleteCarById(String id) {
		repository.deleteById(id);
	}

}