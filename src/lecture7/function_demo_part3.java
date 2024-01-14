package lecture7;

public class function_demo_part3 {
static int val =100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hey");
int a=5;
System.out.println(val);
System.out.println(add(a,45));
System.out.println("bye");
System.out.println(val);

	}
	public static int add(int a, int c) {
		int x = a + c;
		System.out.println(c);
		int val =90; //(2nd part)
		val+=5;
		function_demo_part3.val+=5; //to make it global variable
		return x-2;
		
	}

}
