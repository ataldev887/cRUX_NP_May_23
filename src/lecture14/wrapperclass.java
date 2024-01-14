package lecture14;

public class wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =10;
Integer a1=10;
a1=a1+5;
System.out.println(a1);
Integer b1=19; //in range so same address
Integer b2=19;
Integer c1=190; //out of range so address will be different range(-128to127)
Integer c2=190;
System.out.println(b1==b2);
System.out.println(c1==c2);
	}

}
