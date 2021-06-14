package com.manage.order.next;

public class Error 
{
	String responseStatus;
	String errorcode;
	public String getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}
	public String getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	public Error(String responseStatus, String errorcode) {
		super();
		this.responseStatus = responseStatus;
		this.errorcode = errorcode;
	}
	@Override
	public String toString() {
		return "Error [responseStatus=" + responseStatus + ", errorcode=" + errorcode + "]";
	}
	
	
}
