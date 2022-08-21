package com.ty.controller;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.MyConfigaration;
import com.ty.dao.CarDao;

public class GetAllCars {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigaration.class) ;
		CarDao carDao = (CarDao) applicationContext.getBean("carDao") ;
		
		List<Map<String, Object>> cars  = carDao.getAllCars() ;
		for(Map<String, Object> car : cars) {
			System.out.println(car.get("id"));
			System.out.println(car.get("brand"));
			System.out.println(car.get("type"));
			System.out.println("------------------------------");
		}
	}
}
