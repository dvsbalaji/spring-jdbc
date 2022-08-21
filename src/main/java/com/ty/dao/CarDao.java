package com.ty.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.ty.dto.Car;
import com.ty.helper.CarMapper;
@Component
public class CarDao {

	@Autowired
	JdbcTemplate jdbcTemplate ;
	
	@Autowired
	CarMapper carMapper ;
	
	public void saveCar(Car car) {
		String sql = "INSERT INTO car VALUES(?,?,?)" ;
		Object arg[] = {car.getId() , car.getBrand() ,car.getType()} ;
		jdbcTemplate.update(sql ,arg) ;
		System.out.println("data inserted");
	}
	
	public List<Map<String, Object>> getAllCars() {
		String sql ="SELECT * FROM car WHERE id=1" ;
		return jdbcTemplate.queryForList(sql) ;
	}
	
	public Car getCarById(int id) {
		String sql = "SELECT * FROM car WHERE id= ?" ;
		Object arg[] = {id} ;
		return jdbcTemplate.queryForObject(sql, arg, carMapper) ;
				
	}
	
	public void deleteCar(int id) {
		String sql = "DELETE FROM car WHERE id = ?" ;
		Object arg[] = {id} ;
		jdbcTemplate.update(sql ,arg) ;
		System.out.println("data deleted");
	}
	
	public void updateCarBrand(String brand , int id) {
		String sql = "UPDATE car set brand = ? WHERE id = ?" ;
		Object arg[] = {brand ,id} ;
		jdbcTemplate.update(sql ,arg) ;
		System.out.println("data updated");
	}
	
	
	
}
