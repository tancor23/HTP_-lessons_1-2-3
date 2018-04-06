package by.htp.carparking.impl;

import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.carparking.dao.util.DBConnectionHelper;
import by.htp.carparking.dao.BaseDao;
import by.htp.carparking.domain.Car;

public class CarDBDaoImpl implements BaseDao<Car>{

	@Override
	public void create(Car car) {
		
	}

	@Override
	public Car read(int id) {
		return null;
	}

	@Override
	public List<Car> readAll() {
		ArrayList<Car> cars = new ArrayList<>();
		String query = "Select * FROM cars";
		try (Connection connection = DBConnectionHelper.connect();
				Statement statement = connection.createStatement()
		){
			ResultSet result = statement.executeQuery(query);
			while (result.next()) {
				Car car = new Car();
				car.setId(result.getInt(1));
				car.setBrand(result.getString(2));
				car.setModel(result.getString(3));
				cars.add(car);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;
	}

	@Override
	public void update(Car car) {
		
	}

	@Override
	public void delete(int id) {
		
	}
	
	

}
