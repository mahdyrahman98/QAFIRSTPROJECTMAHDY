package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.dao.OrderitemDAO;
import com.qa.ims.persistence.domain.Orderitem;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	
	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private OrderitemDAO orderitemDAO;
	private CustomerDAO customerDAO;
	private ItemDAO itemDAO;
	private Utils utils;
	

	public OrderController(OrderDAO orderDAO, OrderitemDAO orderitemDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.orderitemDAO = orderitemDAO;
		this.utils = utils;
	}

	/**
	 * Reads all orders to the logger
	 */
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}

	/**
	 * Creates a order by taking in user input
	 */
	@Override
	public Order create() {
		LOGGER.info("Please enter a customer id");
		Long customerid = utils.getLong();
		LOGGER.info("Please enter order value");
		Double ordervalue = utils.getDouble();
		LOGGER.info("Please enter order date");
		String orderdate = utils.getString();
		Order order = orderDAO.create(new Order(customerid, ordervalue, orderdate));
		LOGGER.info("Order created");
		return order;
	}

	/**
	 * Updates an existing order by taking in user input
	 */
	@Override
	public Order update() {
		LOGGER.info("Please enter the customerid of the order you would like to update");
		Long customerid = utils.getLong();
		LOGGER.info("Please enter a new order value");
		Double ordervalue = utils.getDouble();
		LOGGER.info("Please enter an order date");
		String orderdate = utils.getString();
		Order order = orderDAO.update(new Order(customerid, ordervalue, orderdate));
		LOGGER.info("Order Updated");
		return order;
	}

	/**
	 * Deletes an existing order by the id of the order
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long id = utils.getLong();
		return orderDAO.delete(id);
	}
	

}


