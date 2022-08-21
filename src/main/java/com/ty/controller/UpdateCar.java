package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.MyConfigaration;
import com.ty.dao.CarDao;
import com.ty.dto.Car;

public class UpdateCar {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigaration.class) ;
		CarDao carDao = (CarDao) applicationContext.getBean("carDao") ;
		
		carDao.updateCarBrand("kia", 2);
		
		
	}
}
