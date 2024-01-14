package pwskills;
import java.util.*;
public class tripletsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("enter target");
		int target = sc .nextInt();

		System.out.println("no. of pairsum : " + tripletsum(arr,target));
			}
			public static int tripletsum(int[]arr , int target) {
				int ans =0;
				for (int i = 0; i < arr.length; i++) {
					for (int j = i+1; j < arr.length; j++) {
						for (int k = j+1; k < arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==target) {
						ans++;
					}
					}
				}
				}
				return ans;
	}
}
