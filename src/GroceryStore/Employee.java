package GroceryStore;

public class Employee {
	String Empname;
	String postion;
	float salary;
	int experience;
	public Employee(String empname,String postion,float salary,int Experience ) {
		this.Empname=empname;
		this.postion=postion;
		this.salary=salary;
		this.experience=Experience;
	}
	public String getPostion() {
		return postion;
	}
	public float getSalary() {
		return salary;
	}
	public void setPostion(String postion) {
		this.postion = postion;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	private void updatesal(int Rxper) {
		// TODO Auto-generated method stub
		if(this.postion=="Firt-level"){
			 float salary=this.salary+this.experience*1500;
			 setSalary(salary);
			 System.out.println(salary);
			 
		}
		else if (this.postion=="second-level") {
			float salary= this.salary+this.experience*1000;
			setSalary(salary);
			System.out.println(salary);
		}
		else {
			float salary= this.salary+this.experience*500;
			setSalary(salary);
			System.out.println(salary);
		}
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}
