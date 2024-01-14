package lecture27;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s = new Student(); //to access student file in this
System.out.println(s.age);  //0
System.out.println(s.name); //null
s.age =90;
s.name = "RAMU";
System.out.println(s.age); //90
System.out.println(s.name); //ramu
Student s1 = new Student();
System.out.println(s1.age); //0
System.out.println(s1.name); //null
s1.age=21;
s1.name="DEV";
System.out.println(s1.age); //21
System.out.println(s1.name); //dev

s.Intro_Yourself();
s1.Intro_Yourself();

Student s2 = new Student();
s2.age=26;
s2.name="HARDIK";
Student s3 = new Student();
s3.age=28;
s3.name="ANSHUL";
System.out.println(s2.name + " " + s2.age);
System.out.println(s3.name + " " + s3.age);
System.out.println("--------------------");
test1(s2,s3);
System.out.println(s2.name + " " + s2.age);
System.out.println(s3.name + " " + s3.age);
	}
	
	public static void test1(Student s2, Student s3) {
		Student t = s2;
		s2 = s3;
		s3 = t;
	}

}
