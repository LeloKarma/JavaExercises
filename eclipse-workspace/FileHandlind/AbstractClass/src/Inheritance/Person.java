package Inheritance;

public class Person {

	
	String name;
	int Age;
	int id;

public String toString() {
	return "Name:" + name +"Age:" + Age +"id:"+ id;
}
}
	
	class Students extends Person{
		float average;
	
	
	public String toString() {
		return super.toString() + "average:" +average;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Person obj = new Person();
    obj.name = "SHaron";
    obj.Age = 14;
    obj.id = 20210915;
    
    Students stu = new Students();
    stu.Age = 20;
    stu.average = 18;
    
    System.out.println("Person:");
    System.out.println(obj);
    
    System.out.println("Student:");
    System.out.println(stu);
    
    
	}

}
