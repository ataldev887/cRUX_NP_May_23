package lecture2;
import java.util.*;
public class pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int row=1;
int space=0;
int star=n;
while(row<=n) {
	if(row==1 || row==n) {
		int i=1;
		while(i<=n) {
			System.out.print("* ");
			i++;
		}
	}
		else {
			System.out.print("* ");
			int i=1;
			while(i<=n-2) {
				System.out.print("  ");
				i++;
			}
			row++;
			System.out.println();
		}
	}

	
	}

}
