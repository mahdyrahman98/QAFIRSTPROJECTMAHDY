package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.dao.OrderitemDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.domain.Orderitem;
import com.qa.ims.utils.Utils;

public class OrderitemController implements CrudController <Orderitem> {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private OrderitemDAO orderitemDAO;
	private ItemDAO itemDAO;
	private Utils utils;
	ItemController itemcontroller = new ItemController(itemDAO, utils);
	
	


	public OrderitemController(OrderitemDAO orderitemDAO, Utils utils) {
		// TODO Auto-generated constructor stub
		super();
		this.orderitemDAO = orderitemDAO;
		this.utils = utils;
	}

	public List<Orderitem> readAll() {
		List<Orderitem> orderitem = orderitemDAO.readAll();
		for (Orderitem orderitems : orderitem) {
			LOGGER.info(orderitems);
		}
		return orderitem;
		
	}
	
	
	public Orderitem create(Long orderid) {
		LOGGER.info("Please enter the itemid of the item you wish to add");
		LOGGER.info("Below is the list of all the items that are available to add");
		LOGGER.info(itemcontroller.readAll());
		Long itemid = utils.getLong();
		LOGGER.info("Enter in quantity of the selected item that you would like");
		Long itemquantity = utils.getLong();
		Orderitem orderitem = orderitemDAO.update(new Orderitem(itemid, itemquantity, orderid, itemid));
		return orderitem;
		
	}
	
	public Orderitem update() {
		LOGGER.info ("Please enter your orderid");
		Long orderid = utils
		
		

	}
}
	


