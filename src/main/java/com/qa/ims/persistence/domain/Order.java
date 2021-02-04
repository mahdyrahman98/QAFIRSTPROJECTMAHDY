package com.qa.ims.persistence.domain;

public class Order {
	
	private Long orderid;
	private Long customerid;
	private Double ordervalue;
	private String orderdate;
	public Order(Long orderid, Long customerid,  Double ordervalue, String orderdate) {
		super();
		this.orderid = orderid;
		this.customerid = customerid;
		this.ordervalue = ordervalue;
		this.orderdate = orderdate;
	}
	public Order(Long customerid, Double ordervalue, String orderdate) {
	
	
		this.customerid = customerid;
		this.ordervalue = ordervalue;
		this.orderdate = orderdate;
		
		// TODO Auto-generated constructor stub
	}
	
	public Long getOrderid() {
		return orderid;
	}
	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}
	public Long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}
	public Double getOrdervalue() {
		return ordervalue;
	}
	public void setOrdervalue(Double ordervalue) {
		this.ordervalue = ordervalue;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", customerid=" + customerid + ", ordervalue=" + ordervalue
				+ ", orderdate=" + orderdate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerid == null) ? 0 : customerid.hashCode());
		result = prime * result + ((orderdate == null) ? 0 : orderdate.hashCode());
		result = prime * result + ((orderid == null) ? 0 : orderid.hashCode());
		result = prime * result + ((ordervalue == null) ? 0 : ordervalue.hashCode());
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
		Order other = (Order) obj;
		if (customerid == null) {
			if (other.customerid != null)
				return false;
		} else if (!customerid.equals(other.customerid))
			return false;
		if (orderdate == null) {
			if (other.orderdate != null)
				return false;
		} else if (!orderdate.equals(other.orderdate))
			return false;
		if (orderid == null) {
			if (other.orderid != null)
				return false;
		} else if (!orderid.equals(other.orderid))
			return false;
		if (ordervalue == null) {
			if (other.ordervalue != null)
				return false;
		} else if (!ordervalue.equals(other.ordervalue))
			return false;
		return true;
	}
	
	
	
}
