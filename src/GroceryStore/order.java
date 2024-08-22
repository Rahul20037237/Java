package GroceryStore;

import java.util.*;

public class order {
	String idString;
	customer customer;
	String dateString;
	float totalAmount;
	
	public order(String id,customer customer,String date,float totalamt) {
		// TODO Auto-generated constructor stub
		this.idString=id;
		this.customer=customer;
		this.dateString=date;
		this.totalAmount=totalamt;
	}
	public void setCustomer(customer customer) {
		this.customer = customer;
	}
	public void setDateString(String dateString) {
		this.dateString = dateString;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public customer getCustomer() {
		return customer;
	}
	public String getDateString() {
		return dateString;
	}
	public String getIdString() {
		return idString;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	private void listproduct(List<product> prod) {
		// TODO Auto-generated method stub
		prod.stream().forEach(System.out::println);
	}

}
