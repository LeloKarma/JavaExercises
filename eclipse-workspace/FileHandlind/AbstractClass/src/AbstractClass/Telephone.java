package AbstractClass;

public class Telephone {

	 void lift() {
		 
	 }
	 void disconnected() {
		 
	 }
	 class SmartTelephone extends Telephone{
		 void disconnected() {System.out.println("The phone is ringing");
	 }
	 
public static void main(String[] args) {
	
	Telephone Tel;
	Tel = new Telephone();
	Tel.disconnected();
	Tel.lift();
}
}
}