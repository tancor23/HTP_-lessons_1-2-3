package by.htp.carparking.dao;

import by.htp.carparking.domain.Order;

public interface OrderDAO extends BaseDao<Order> {
	
	void insertNewOrder (int userId, int carId);

}
