package com.qa.ims.persistence.domain;

public class Orderitem {
	
	private Long orderitemid;
	private Long orderid;
	private Long itemid;
	private Long orderquantity;
	public Orderitem(Long orderitemid, Long orderid, Long itemid, Long orderquantity) {
		super();
		this.orderitemid = orderitemid;
		this.orderid = orderid;
		this.itemid = itemid;
		this.orderquantity = orderquantity;
	}
	public Long getOrderitemid() {
		return orderitemid;
	}
	public void setOrderitemid(Long orderitemid) {
		this.orderitemid = orderitemid;
	}
	public Long getOrderid() {
		return orderid;
	}
	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}
	public Long getItemid() {
		return itemid;
	}
	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}
	public Long getOrderquantity() {
		return orderquantity;
	}
	public void setOrderquantity(Long orderquantity) {
		this.orderquantity = orderquantity;
	}
	@Override
	public String toString() {
		return "Orderitem [orderitemid=" + orderitemid + ", orderid=" + orderid + ", itemid=" + itemid
				+ ", orderquantity=" + orderquantity + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemid == null) ? 0 : itemid.hashCode());
		result = prime * result + ((orderid == null) ? 0 : orderid.hashCode());
		result = prime * result + ((orderitemid == null) ? 0 : orderitemid.hashCode());
		result = prime * result + ((orderquantity == null) ? 0 : orderquantity.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orderitem other = (Orderitem) obj;
		if (itemid == null) {
			if (other.itemid != null)
				return false;
		} else if (!itemid.equals(other.itemid))
			return false;
		if (orderid == null) {
			if (other.orderid != null)
				return false;
		} else if (!orderid.equals(other.orderid))
			return false;
		if (orderitemid == null) {
			if (other.orderitemid != null)
				return false;
		} else if (!orderitemid.equals(other.orderitemid))
			return false;
		if (orderquantity == null) {
			if (other.orderquantity != null)
				return false;
		} else if (!orderquantity.equals(other.orderquantity))
			return false;
		return true;
	}
	

}
