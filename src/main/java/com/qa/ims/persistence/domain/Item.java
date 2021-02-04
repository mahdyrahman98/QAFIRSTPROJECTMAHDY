package com.qa.ims.persistence.domain;

public class Item {
	
	
	private Long itemid;
	private String itemName;
	
	private double price;
	public Item(Long itemid, String itemName, Double price) {
		super();
		this.itemid = itemid;
		this.itemName = itemName;
		this.price = price;
	}
	public Item(String itemName, Double price) {
		this.itemName = itemName;
		this.price = price;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemName=" + itemName + ", price=" + price + "]";
	}
	public Long getItemid() {
		return itemid;
	}
	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		long result = 1;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + itemid;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return (int) result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (itemid != other.itemid)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
	}

	
	

	
	

//}
