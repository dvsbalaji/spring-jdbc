package com.ty.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ty.dto.Car;
@Component
public class CarMapper implements RowMapper<Car>{

	@Autowired
	Car car ;
	public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
		car.setId(rs.getInt(1));
		car.setBrand(rs.getString(2));
		car.setType(rs.getString(3));
		return car ;
		
	}

}
