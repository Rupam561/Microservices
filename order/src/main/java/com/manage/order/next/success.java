package com.manage.order.next;

public class success 
{
	String responseStatus;
	Integer id;
	public String getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public success(String responseStatus, Integer id) {
		super();
		this.responseStatus = responseStatus;
		this.id = id;
	}
	@Override
	public String toString() {
		return "success [responseStatus=" + responseStatus + ", id=" + id + "]";
	}
	
}
