package AbstractClass;

public interface tvRemote {
	
void on();
void display1();
}

 interface SmartTv extends tvRemote {
	
	void off();
		
	}
 class Tv implements tvRemote {
	
	  public void on() {
	 System.out.println("Put on the tv");
}
 
  public void display1() {
	  System.out.println("The tv is off");
}
class Main{
	public static void main(String[] args) {
		Tv obj = new Tv();
		     obj.on();
	
	}
}

}
	

