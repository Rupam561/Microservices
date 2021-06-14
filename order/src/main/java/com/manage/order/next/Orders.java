package com.manage.order.next;
import java.util.List;


public class Orders {
	private String name;
	private String adress;
	private int amount;
	List <cartDetails> cart;
	public Orders(String name, String adress, int amount, List<cartDetails> cart) {
		super();
		this.name = name;
		this.adress = adress;
		this.amount = amount;
		this.cart = cart;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public List<cartDetails> getCart() {
		return cart;
	}
	public void setCart(List<cartDetails> cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "Orders [name=" + name + ", adress=" + adress + ", amount=" + amount + ", cart=" + cart + "]";
	}
	
	
	

}
