package com.infosys.carRentalSystem.dao;

import com.infosys.carRentalSystem.bean.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {
    
   
    List<Car> findByAvailableTrue();

   
    List<Car> findByManufacturer(String manufacturer);
}