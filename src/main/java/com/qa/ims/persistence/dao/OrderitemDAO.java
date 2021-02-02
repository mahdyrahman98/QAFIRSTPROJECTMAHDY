package com.qa.ims.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.qa.ims.persistence.domain.Orderitem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.qa.ims.utils.DBUtils;

public class OrderitemDAO implements Dao<Orderitem>{
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	
	@Override
	public Orderitem modelFromResultSet(ResultSet resultSet) throws SQLException {
		Long orderitemid = resultSet.getLong("orderitemid");
		Long orderid = resultSet.getLong("orderid");
		Long itemid = resultSet.getLong("itemid");
		Long orderquantity = resultSet.getLong("orderquantity");
		return new Orderitem(orderitemid, orderid, itemid, orderquantity);
	}

	/**
	 * Reads all orderitems from the database
	 * 
	 * @return A list of orderitems
	 */
	@Override
	public List<Orderitem> readAll() {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM orderitems");) {
			List<Orderitem> orderitems = new ArrayList<>();
			while (resultSet.next()) {
				orderitems.add(modelFromResultSet(resultSet));
			}
			return orderitems;
		} catch (SQLException e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return new ArrayList<>();
	}

	public Orderitem readLatest() {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM orderitems ORDER BY id DESC LIMIT 1");) {
			resultSet.next();
			return modelFromResultSet(resultSet);
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	/**
	 * Creates a orderitem in the database
	 * 
	 * @param orderitem - takes in a orderitem object. id will be ignored
	 */
	@Override
	public Orderitem create(Orderitem orderitem) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection
						.prepareStatement("INSERT INTO orderitems(first_name, surname) VALUES (?, ?)");) {
			statement.setLong(1, orderitem.getOrderitemid());
			statement.setLong(2, orderitem.getOrderid());
			statement.setLong(3, orderitem.getItemid());
			statement.setLong(4, orderitem.getOrderquantity());
			statement.executeUpdate();
			return readLatest();
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public Orderitem read(Long id) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection.prepareStatement("SELECT * FROM orderitems WHERE id = ?");) {
			statement.setLong(1, id);
			try (ResultSet resultSet = statement.executeQuery();) {
				resultSet.next();
				return modelFromResultSet(resultSet);
			}
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	/**
	 * Updates a orderitem in the database
	 * 
	 * @param orderitem - takes in a orderitem object, the id field will be used to
	 *                 update that orderitem in the database
	 * @return
	 */
	@Override
	public Orderitem update(Orderitem orderitem) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection
						.prepareStatement("UPDATE orderitems SET first_name = ?, surname = ? WHERE id = ?");) {
			statement.setLong(1, orderitem.getOrderitemid());
			statement.setLong(2, orderitem.getOrderid());
			statement.setLong(3, orderitem.getItemid());
			statement.setLong(4, orderitem.getOrderquantity());
			statement.executeUpdate();
			return read(orderitem.getOrderitemid());
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	/**
	 * Deletes a orderitem in the database
	 * 
	 * @param id - id of the orderitem
	 */
	@Override
	public int delete(long id) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection.prepareStatement("DELETE FROM orderitems WHERE id = ?");) {
			statement.setLong(1, id);
			return statement.executeUpdate();
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return 0;
	}

}

	


