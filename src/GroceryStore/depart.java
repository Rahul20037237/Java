package GroceryStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class depart {
	String departname;
	String manaeger;
	Map<String,List<product>> productMap;
	public depart(String departnmae,String manager) {
		this.departname=departnmae;
		this.manaeger=manager;
		this.productMap = new HashMap<>();
	}
	public String getDepartname() {
		return departname;
	}
	public String getManaeger() {
		return manaeger;
	}
	public void addproduct(String departname,List<product> products){
		this.productMap.put(departname, products);
	}
	public void setManaeger(String manaeger) {
		this.manaeger = manaeger;
	}
	public void displayProduct(String department){
		if(this.productMap.containsKey(department)){
			System.out.println("Products in " + departname + ": " + productMap.get(departname));
	}
		else{
			 System.out.println("No products found in " + departname);
			}
		}

}
