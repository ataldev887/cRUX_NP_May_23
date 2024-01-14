package lecture13;
import java.util.*;
public class userinput2darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int[][]arr=new int[n][m];
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[0].length;j++) {
		arr[i][j]=sc.nextInt();
	}
}

display(arr);
	}
	
	public static void display(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println(arr[i][j]+" ");
	}
			System.out.println();

      }
}
}