package by.htp.carparking.service.impl;

import by.htp.carparking.dao.OrderDAO;
import by.htp.carparking.impl.OrderDaoDBImpl;
import by.htp.carparking.service.OrderService;

public class OrderServiceImpl implements OrderService{
	
	//TODO add  IoC
	private OrderDAO orderDAO = new OrderDaoDBImpl();

	@Override
	public void orderCar(int userId, int carId) {
		orderDAO.insertNewOrder(userId, carId);
		
	}

}
