package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

public class ItemController implements CrudController<Item> {
	

	public static final Logger LOGGER = LogManager.getLogger();
	
	
	
	private ItemDAO itemDAO;
	private Utils utils;
	
	
	
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

	public Item create() {
		LOGGER.info("Please enter the item name that you want");
		String itemName = utils.getString();
		LOGGER.info("Please enter the item price");
		double price = utils.getDouble();
		Item item = itemDAO.create(new Item (itemName, price));
		LOGGER.info("Item created");
		
	
		return item;
	}

	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter the item name");
		String itemName = utils.getString();
		LOGGER.info("Please enter a new price");
		Double price = utils.getDouble();
		Item item = (Item) itemDAO.update(new Item(id, itemName, price));
		LOGGER.info("item updated");
		return item;
		
		
		// TODO Auto-generated method stu
	}

	@Override
	public int delete() {
		LOGGER.info("please entrer the id of item that you would like to delete");
		Long id = utils.getLong();
		return itemDAO.delete(id);
	}





}
