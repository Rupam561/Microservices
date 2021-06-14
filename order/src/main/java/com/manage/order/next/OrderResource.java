package com.manage.order.next;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderResource 
{
	@Autowired
	private OrderService service;
	@GetMapping("/allorders")
	private ResponseEntity <List<Orders>> retrieveall()
	{
		return new ResponseEntity<List<Orders>>(service.findall(), HttpStatus.OK);
	}
	@PostMapping("/validateOrder")
	public ResponseEntity<String> validateOrder(@RequestBody List<Inventory> inventories)
	{
		return new ResponseEntity<String>(service.validateOrder(inventories),HttpStatus.OK);
	}
	
	@PostMapping("/executeOrder")
	public ResponseEntity<String> NewOrder(@RequestBody Orders orders)
	{
		ResponseEntity<String> orderresponse = new ResponseEntity<String>(service.NewOrder(orders),HttpStatus.OK);
		List<cartDetails> cartdetail = orders.getCart();
		String validateresponse = service.validateAndExecuteOrder(cartdetail);
		if(validateresponse.equals(service.inventoryerror.toString()))
		{
			return new ResponseEntity<String>(validateresponse,HttpStatus.OK);
		}
		else if (validateresponse.contains("false"))
		{
			return new ResponseEntity<String>(service.inventoryerror.toString(),HttpStatus.OK);
		}
		else
		{
			return orderresponse;
		}
	}
	
	
}
