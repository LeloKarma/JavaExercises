package AbstractClass;

import Inheritance.Employee;

public class Manager implements Printable {
	
	 private String name;
	    private int age;
	    private int hourRate;
	    
    public Manager(String name, int age, int hourRate) {
    	//create an instance of the abrittude self
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;
    }
    
    public void print() {
    	System.out.println("SportCar: name=" + name + ", age=" + age + "hourRate=" + hourRate);
    }
}