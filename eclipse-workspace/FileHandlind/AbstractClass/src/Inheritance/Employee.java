package Inheritance;

public abstract class Employee {
	static String name;
	double age;
	double hourRate;
	
	
	public abstract double salary(double hours);
	
	public String toString() {
		return "name = " +name + "age = " +age + "hourRate= " +hourRate;
	}
	
	public class Manager extends Employee {
	    public Manager(String name, double age, double hourRate) {
	    	//create an instance of the abrittude self
	        this.name = name;
	        this.age = age;
	        this.hourRate = hourRate;
	    }
	    
	    public double salary(double hours) {
	      
	        return hourRate * hours;
	    }
	}

	public class Clerk extends Employee {
	    public Clerk(String name, double age, double hourRate) {
	    	 this.name = name;
		     this.age = age;
		      this.hourRate = hourRate;
	    }
	    
	    public void print()  {
	       
	        return hourRate 
	    }
	}


	public static void main(String[] args) {
		
		Manager manager = new Manager("lelo", 45, 76.0);
		System.out.println("Manager: " +manager.toString());
		System.out.println("Manager salary for 40hours: " +manager.salary(40));
	
		
		Clerk clerk = new Clerk("Sha", 28, 155);
		System.out.println("Clerk: " +clerk.toString());
		System.out.println("Clerk salary for 40hours: " +clerk.salary(40));
	}

}
