package lecture3;
import java.util.*;
public class pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int row=1;
int space=0;
int star=n;
while(row<=2*n-1) {
	int i=1;
	while(i<=space) {
		System.out.print("  ");
		i++;
	}
	int j=1;
	while(j<=star) {
		System.out.print("* ");
		j++;
	}
	
	if(row<n) {
		star--;
		space=space+2;
	}
	else {
		star++;
		space=space-2;
	}
	
	
	row++;
	System.out.println();
}
	}

}
