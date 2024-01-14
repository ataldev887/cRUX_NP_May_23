package lecture7;
import java.util.*;
public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
System.out.println(armstrong(n));

	}
	
	public static boolean armstrong(int n) {
		int c = countofdigit(n);
		int sum =0;
		int p=n;
		while (n>0) {
			int rem=n%10;
			sum = (int)(sum + Math.pow(rem, c));
			n=n/10;
		}
		return sum==p;
	}
	
	public static int countofdigit(int n) {
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}

}
