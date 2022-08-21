package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.MyConfigaration;
import com.ty.dao.CarDao;
import com.ty.dto.Car;

public class GetCarById {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigaration.class) ;
		CarDao carDao = (CarDao) applicationContext.getBean("carDao") ;
		
		Car car = carDao.getCarById(4) ;
		
		if(car != null) {
			System.out.println(car.getId());
			System.out.println(car.getBrand());
			System.out.println(car.getType());
		}else {
			System.out.println("there is no car with specified ID");
		}
	}
}
