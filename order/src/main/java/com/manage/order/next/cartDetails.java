package com.manage.order.next;

public class cartDetails 
{

	String itemcode;
	Integer quantity;
	public cartDetails(String itemcode, Integer quantity) {
		super();
		this.itemcode = itemcode;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "cartDetails [itemcode=" + itemcode + ", quantity=" + quantity + "]";
	}
	public String getItemcode() {
		return itemcode;
	}
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
