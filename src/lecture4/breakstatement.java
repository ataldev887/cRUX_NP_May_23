package lecture4;
import java.util.*;
import java.util.Scanner;

public class breakstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int factor=0;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				factor++;
				break;
			}
		}

		if(factor>=1) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
			}

		}

