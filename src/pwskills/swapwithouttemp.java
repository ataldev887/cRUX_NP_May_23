package pwskills;

public class swapwithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =9;
		int b=3;
swapwithouttemp(a,b);
	}
public static void swapwithouttemp(int a ,int b) {
	System.out.println("original values before swap: ");
	System.out.println("a: " + a);
	System.out.println("b: " + b);
	
	a = a +b;
	b=a-b;
	a=a-b;
	
	System.out.println("values after swap: ");
	System.out.println("a: " + a);
	System.out.println("b: " + b);
	

	}

}
