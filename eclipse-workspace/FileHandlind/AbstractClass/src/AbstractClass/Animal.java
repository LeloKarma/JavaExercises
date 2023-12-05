package AbstractClass;

//create an interface
public interface Animal {

	//unimplemented interface methods
	void eat();
	void sleep();
	
	//creating an instance of a the interface
	public class Dog implements Animal{
		@Override
		public void eat() {
			System.out.println("The dog is eating meat");
		}

		@Override
		public void sleep() {
			// TODO Auto-generated method stub
			System.out.println("The dog is seeping");
		}
		public class Main{
			public static void main(String[] args) {
				Dog dog = new Dog();
				dog.eat();
				
			}
		}
	}
}
