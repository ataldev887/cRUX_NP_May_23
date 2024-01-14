package assignment3;
import java.util.*;
public class squareofsortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt();
	 int[]arr=new int[n];
	 for(int i=0;i<arr.length;i++) {
		 arr[i]=sc.nextInt();
	 }
	 int[]ans = square(arr);
	 for (int i = 0; i < ans.length; i++) {
		 Arrays.sort(ans);
		 System.out.print(ans[i]+" ");	
	}
	}
	 public static int[] square(int []arr) {
		 int []squared=new int[arr.length];
		 for(int i=0;i<arr.length;i++) {
			 squared[i]=arr[i]*arr[i];
		 }
		 return squared;
	 }
	
}
