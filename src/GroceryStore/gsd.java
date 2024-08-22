package GroceryStore;

import java.util.ArrayList;
import java.util.List;

public class gsd {
	private String name;
	private String location;
	private String openhour;
	private List<depart> departs;
	
	public gsd(String name,String location,String openhours,List<depart> a ) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.location=location;
		this.openhour=openhours;
		this.departs=a;
	}
	public String getLocation() {
		return location;
	}
	public String getOpenhour() {
		return openhour;
	}
	public List<depart> getDeparts() {
		return departs;
	}
	public void addDepartment(depart D) {
		this.departs.add(D);
	}
	private void showDepartment() {
		// TODO Auto-generated method stub
		System.out.println("Departmnet's in "+name+":");
		for(depart a:departs){
			System.out.println(a.getDepartname());
			
		}

	}
}
