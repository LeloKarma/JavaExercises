package Inheritance;

public class SportCar {

	private String brand;
	private String color;
	
	void speed() {
		System.out.println("The sportcar is speeding");
	}
	  
	void accelerate() {
		System.out.println("The sportcar accelerates");
	}
	  public String toString() {
		  return "Name: " + brand + "color: " + color;
	  }
	  class Car extends SportCar {
		  private int yearOfcreation;
		  private int plateNumber;
		  
	      void ride() {
			  System.out.println("The car is riding");
		  }
		  
		  void stop() {
			  System.out.println("Stop the car");
		  }
		  
		  public String toString() {
			  return "year:" + yearOfcreation +"Plate: "+ plateNumber;
		  }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		SportCar scar = new SportCar();
		scar.brand = "toyota";
		scar.color = "Red";
		
		
		System.out.println(scar);
	}
}

