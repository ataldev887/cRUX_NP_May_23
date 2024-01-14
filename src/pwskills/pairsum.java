package pwskills;
import java.util.*;
public class pairsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("enter target");
		int target = sc .nextInt();

		System.out.println("no. of pairsum : " + pairsum(arr,target));
			}
			public static int pairsum(int[]arr , int target) {
				int ans =0;
				for (int i = 0; i < arr.length; i++) {
					for (int j = i+1; j < arr.length; j++) {
					if(arr[i]+arr[j]==target) {
						ans++;
					}
				}
				}
				return ans;
	}
}
