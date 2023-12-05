package AbstractClass;

public class Monkey {
	
	void jump() {
		System.out.println("The monkey is jumping");
	}
	void bite() {
		System.out.println("The monkey is biting banana");
		}
	interface Animal{
		void eat();
		void sleep();
	}
	class Human extends Monkey implements Animal{
		
		
		public void eat() {
			System.out.println("He is eating");
		}
		
		public void sleep() {
			System.out.println("She is sleeping");
		}
		//main method
		public class Main{
			public static void main(String[] args) {
		    Human Him = new Human();
		    Him.jump();
		    Him.bite();
			Him.eat();
			Him.sleep();
			
		}
	}
		Animal dog = (Animal)dog;
	
		Dog.bite();
		
		
				
	}
}
