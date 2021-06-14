package com.manage.order.next;

public class Inventory 
{
	String itemCode;
	int quantity;
	public Inventory(String itemCode, int quantity) {
		super();
		this.itemCode = itemCode;
		this.quantity = quantity;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Inventory [itemCode=" + itemCode + ", quantity=" + quantity + "]";
	}
	
}
