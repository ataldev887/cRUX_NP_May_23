package lecture3;
import java.util.*;
public class pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
int row=1;
int space=n-2;
int space1=0;
while(row<=n){
	int j=1;
	while(j<=space1) {
		System.out.print("  ");
		j++;
	}
	System.out.print("*"+" ");
	int i=1;
	while(i<=space) {
		System.out.print("  ");
		i++;
	}
	if(row != (n/2)+1) {
		System.out.print("*" + " ");
	}
	
	if(row<=n/2) {
		space1++;
		space-=2;
	}
	else {
		space1--;
		space+=2;
	}
	
	row++;
	System.out.println();
}
	}

}
