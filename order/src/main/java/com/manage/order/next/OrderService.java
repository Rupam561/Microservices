package com.manage.order.next;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;




@Component
public class OrderService 
{
	public static List<Orders> order= new ArrayList<>();
	
	static
	{
		order.add(new Orders("Rupam", "Assam", 5000, Arrays.asList(new cartDetails("ITEM1", 4))));
		order.add(new Orders("Abhishek", "Sikkim", 7000, Arrays.asList(new cartDetails("ITEM7", 15))));
	}
	
	success msgsuccess = new success("Success", new Random().nextInt(10000));
	Error paymenterror = new Error("ERROR", "PAYMENT_NOT_VALID");
	Error carterror = new Error("ERROR", "CART_EMPTY_ERROR");
	Error addresserror = new Error("ERROR", "NO_SHIPPING_ADDRESS_ERROR");
	Error inventoryerror = new Error("ERROR", "ITEMS_NOT_IN_INVENTORY");
	Error internalerror = new Error("ERROR", "INTERNAL_ERROR");
	
	public String NewOrder(Orders orders)
	{
		if(orders.getAmount()<0)
		{
			return paymenterror.toString();
		}
		else if(orders.getAdress()=="")
		{
			return addresserror.toString();
		}
		else if (orders.getCart().isEmpty())
		{
			return carterror.toString();
		}
		else
		{
			order.add(orders);
			return msgsuccess.toString();
		}
	}
	public List<Orders> findall()
	{
		return order;
	}
	
	invsuccess message;
	itemdetails details;
	
	List<Inventory> inventory = new ArrayList<Inventory>(Arrays.asList(new Inventory("ITEM4", 8), new Inventory("ITEM2",12)));
	
	public String validateOrder(List<Inventory> inventories)
	{
		List<itemdetails> itemdetailslist = new ArrayList<itemdetails>();
		
		try {
			
			for(int i=0;i<inventories.size();i++)
			{
				if(inventories.get(i).getItemCode().equals(inventory.get(0).getItemCode()))
				{
					if(inventories.get(i).getQuantity()<=inventory.get(0).getQuantity())
					{
						details = new itemdetails(inventories.get(i).getItemCode(),inventories.get(i).getQuantity(),true);
						itemdetailslist.add(details);
						message = new invsuccess("success", itemdetailslist);
					}
					else
					{
						details = new itemdetails(inventories.get(i).getItemCode(),inventories.get(i).getQuantity(),false);
						itemdetailslist.add(details);
						message = new invsuccess("success", itemdetailslist);
					}
				}
				else if(inventories.get(i).getItemCode().equals(inventory.get(1).getItemCode())) 
				{
					if(inventories.get(i).getQuantity()<=inventory.get(1).getQuantity())
					{
						details = new itemdetails(inventories.get(i).getItemCode(),inventories.get(i).getQuantity(),true);
						itemdetailslist.add(details);
						message = new invsuccess("success", itemdetailslist);
					}
					else
					{
						details = new itemdetails(inventories.get(i).getItemCode(),inventories.get(i).getQuantity(),false);
						itemdetailslist.add(details);
						message = new invsuccess("success", itemdetailslist);
					}
				}
				else
				{
					return inventoryerror.toString();
				}
			}
			return message.toString();
		}
		catch(Exception e)
		{
			return internalerror.toString();
		}
	}
	
	public String validateAndExecuteOrder(List<cartDetails> inventories)
	{
		List<itemdetails> itemdetailslist = new ArrayList<itemdetails>();
try {
			
			for(int i=0;i<inventories.size();i++)
			{
				if(inventories.get(i).getItemcode().equals(inventory.get(0).getItemCode()))
				{
					if(inventories.get(i).getQuantity()<=inventory.get(0).getQuantity())
					{
						details = new itemdetails(inventories.get(i).getItemcode(),inventories.get(i).getQuantity(),true);
						itemdetailslist.add(details);
						message = new invsuccess("success", itemdetailslist);
					}
					else
					{
						details = new itemdetails(inventories.get(i).getItemcode(),inventories.get(i).getQuantity(),false);
						itemdetailslist.add(details);
						message = new invsuccess("success", itemdetailslist);
					}
				}
				else if(inventories.get(i).getItemcode().equals(inventory.get(1).getItemCode())) 
				{
					if(inventories.get(i).getQuantity()<=inventory.get(1).getQuantity())
					{
						details = new itemdetails(inventories.get(i).getItemcode(),inventories.get(i).getQuantity(),true);
						itemdetailslist.add(details);
						message = new invsuccess("success", itemdetailslist);
					}
					else
					{
						details = new itemdetails(inventories.get(i).getItemcode(),inventories.get(i).getQuantity(),false);
						itemdetailslist.add(details);
						message = new invsuccess("success", itemdetailslist);
					}
				}
				else
				{
					return inventoryerror.toString();
				}
			}
			return message.toString();
		}
		catch(Exception e)
		{
			return internalerror.toString();
		}
	}
	
	
	
}

