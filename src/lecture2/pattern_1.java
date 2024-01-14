package lecture2;
import java.util.*;
public class pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
//int a = sc.nextInt();
//int b = sc.nextInt();
//int c = a + b;
//System.out.println(c);
int n = sc.nextInt();
int row = 1;
int star = n;
while(row<=n) {
	//
	int i=1;
	while(i<=star) {
		System.out.print("* ");
		i++;
	}
	row++;
	System.out.println();

}
	}

}
