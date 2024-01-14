package lecture2;
import java.util.*;
public class patternnumberladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		while(row<n) {
			int i=1;
			int val=1;
			while(i<=star) {
				System.out.print(val);
				i++;
				val++;
			}
			row++;
	        star++;
	        System.out.println();
		}
		
	}

}
