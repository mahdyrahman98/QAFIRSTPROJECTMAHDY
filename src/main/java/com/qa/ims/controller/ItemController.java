package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

public abstract class ItemController implements CrudController<Item> {
	

	public static final Logger LOGGER = LogManager.getLogger();
	
	
	@SuppressWarnings({ "unused", "rawtypes" })
	private ItemDAO itemDAO;
	private Utils utils;
	
	
	@SuppressWarnings("rawtypes")
	public ItemController(ItemDAO itemDAO, Utils utils) {
		super();
		this.itemDAO = itemDAO;
		this.utils = utils;	
		
	}
	

	@Override
	public List<Item> readAll() {
		List<Item> item = itemDAO.readAll();
		for (Item items : item) {
			LOGGER.info(items);
			
		}
		return item;
	}

	public Item create(Item item) {
		LOGGER.info("Please enter the item name that you want");
		String itemName = utils.getString();
		LOGGER.info("Please enter the item price");
		double price = utils.getDouble();
		LOGGER.info( "Please enter the brand of your item");
		String brand = utils.getString();
		LOGGER.info("Item created");
			// TODO Auto-generated method stub
		return item;
	}

	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item would like to update");
		Long id = utils.getLong();
		LOGGER.info();
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}




}
