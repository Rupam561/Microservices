package com.manage.order.next;

import java.util.List;

public class invsuccess 
{
	String responseCode;
	List<itemdetails> itemDetails;
	public invsuccess(String responseCode, List<itemdetails> itemDetails) {
		super();
		this.responseCode = responseCode;
		this.itemDetails = itemDetails;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public List<itemdetails> getItemDetails() {
		return itemDetails;
	}
	public void setItemDetails(List<itemdetails> itemDetails) {
		this.itemDetails = itemDetails;
	}
	@Override
	public String toString() {
		return "invsuccess [responseCode=" + responseCode + ", itemDetails=" + itemDetails + "]";
	}
	
}
