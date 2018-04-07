package by.htp.carparking.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.htp.carparking.dao.OrderDAO;
import by.htp.carparking.dao.util.DBConnectionHelper;
import by.htp.carparking.domain.Order;

public class OrderDaoDBImpl implements OrderDAO {
	
	private static final Logger logger = LogManager.getLogger(); 

	@Override
	public void create(Order entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Order read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Order entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertNewOrder(int userId, int carId) {
		try (Connection connection = DBConnectionHelper.connect();
				PreparedStatement ps = connection
						.prepareStatement("INSERT INTO orders ('user_id', 'car_id') VALUES ('?', '?');")) {
			ps.setInt(1, userId);
			ps.setInt(2, carId);
			ps.executeUpdate();
			
			logger.error("Error is in insertNewOrder");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
