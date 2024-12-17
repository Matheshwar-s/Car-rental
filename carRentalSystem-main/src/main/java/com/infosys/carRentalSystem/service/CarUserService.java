package com.infosys.carRentalSystem.service;

import com.infosys.carRentalSystem.bean.CarUser;
import com.infosys.carRentalSystem.dao.CarUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CarUserService implements UserDetailsService {
    @Autowired
    private CarUserRepository repository;
    
    private String role;
    private String userName;
    private String email;
    
    public void save(CarUser carUser) {
        repository.save(carUser);
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	CarUser carUser = repository.findById(username).get();
    	role = carUser.getRole();
    	userName=carUser.getUsername();
    	email=carUser.getEmail();
    	return carUser;
    }
    public String getRole() {
    	return role;
    }
    public String getUserName() {
    	return userName;
    }
    public String getEmail() {
    	return email;
    }
}