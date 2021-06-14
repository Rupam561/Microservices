package com.manage.order.next;

public class itemdetails 
{
	String itemcode;
	int quantity;
	boolean available;
	public itemdetails(String itemcode, int quantity, boolean available) {
		super();
		this.itemcode = itemcode;
		this.quantity = quantity;
		this.available = available;
	}
	public String getItemcode() {
		return itemcode;
	}
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "itemdetails [itemcode=" + itemcode + ", quantity=" + quantity + ", available=" + available + "]";
	}
	
	
	
}
