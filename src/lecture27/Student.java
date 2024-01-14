package lecture27;

public class Student{
	
	String name;
	int age;
	
	public void Intro_Yourself() { //by using this.name it will go to student class otherwise local variable will be accessed
		String name = "raju";
		System.out.println("My Name is " + this.name + " and age is " + this.age);
	}
}
