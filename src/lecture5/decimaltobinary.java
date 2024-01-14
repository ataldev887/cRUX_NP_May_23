package lecture5;
import java.util.*;
public class decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=11011011;
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem = n%10;
			sum = sum + rem*mul;
			n = n/10;
			mul = mul*2;
		}
		int a = 041;
		System.out.println(a);
		System.out.println(sum);
	}

}
