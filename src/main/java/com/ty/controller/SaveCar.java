package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.MyConfigaration;
import com.ty.dao.CarDao;
import com.ty.dto.Car;

public class SaveCar {
	
	

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigaration.class) ;
		CarDao carDao = (CarDao) applicationContext.getBean("carDao") ;
		
		Car car = new Car() ;
		car.setId(3);
		car.setBrand("mahindra");
		car.setType("suv");
		
		carDao.saveCar(car);
		
	}
}
