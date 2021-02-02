package com.qa.ims.persistence.domain;

public class Item {
	
	
	private Long itemid;
	private String itemName;
	private String brand;
	private double price;
	public Item(long itemid, String itemName, String brand, double price) {
		super();
		this.itemid = itemid;
		this.itemName = itemName;
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemName=" + itemName + ", brand=" + brand + ", price=" + price + "]";
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
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
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
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
	
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((item_brand == null) ? 0 : item_brand.hashCode());
//		result = prime * result + item_id;
//		result = prime * result + ((item_name == null) ? 0 : item_name.hashCode());
//		long temp;
//		temp = Double.doubleToLongBits(item_price);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Item other = (Item) obj;
//		if (item_brand == null) {
//			if (other.item_brand != null)
//				return false;
//		} else if (!item_brand.equals(other.item_brand))
//			return false;
//		if (item_id != other.item_id)
//			return false;
//		if (item_name == null) {
//			if (other.item_name != null)
//				return false;
//		} else if (!item_name.equals(other.item_name))
//			return false;
//		if (Double.doubleToLongBits(item_price) != Double.doubleToLongBits(other.item_price))
//			return false;
//		return true;
//	}
//	@Override
//	public String toString() {
//		return "Item [item_id=" + item_id + ", item_name=" + item_name + ", item_brand=" + item_brand + ", item_price="
//				+ item_price + "]";
//	}
//	public int getItem_id() {
//		return item_id;
//	}
//	public void setItem_id(int item_id) {
//		this.item_id = item_id;
//	}
//	public String getItem_name() {
//		return item_name;
//	}
//	public void setItem_name(String item_name) {
//		this.item_name = item_name;
//	}
//	public String getItem_brand() {
//		return item_brand;
//	}
//	public void setItem_brand(String item_brand) {
//		this.item_brand = item_brand;
//	}
//	public double getItem_price() {
//		return item_price;
//	}
//	public void setItem_price(double item_price) {
//		this.item_price = item_price;
//	}
//	public Item(int item_id, String item_name, String item_brand, double item_price) {
//		super();
//		this.item_id = item_id;
//		this.item_name = item_name;
//		this.item_brand = item_brand;
//		this.item_price = item_price;
//	}
//	private String item_brand;
//	private double item_price;
//	
//	
//
//}
