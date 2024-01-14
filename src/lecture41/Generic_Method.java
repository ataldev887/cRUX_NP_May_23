package lecture41;

public class Generic_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str[] = {"Raj","Rahul","Kunal","Komal"};
Integer arr[] = {10,20,30,40};
Display(str);
Display(arr);
	}
	public static <t> void Display(t str[]) {
		for(int i=0; i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
	}

}
