package pwskills;
import java.util.*;
public class secondmaxinarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}

		System.out.println("secondmax is : " + secondmax(arr));
			}
			public static int max(int[]arr) {
				int mx=Integer.MIN_VALUE;
				for (int i = 0; i < arr.length; i++){
					if(arr[i]>mx) {
						mx=arr[i];
					}
				}
				return mx;
	}
			public static int secondmax(int []arr) {
				int mx=max(arr);
				for (int i = 0; i < arr.length; i++) {
					if(arr[i]==mx) {
						arr[i]=Integer.MIN_VALUE;
					}
				}
				int secondmax = max(arr);
				return secondmax;
			}
	}
