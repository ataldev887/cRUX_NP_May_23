package pwskills;
import java.util.*;
public class maxinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}

		System.out.println("max is : " + max(arr));
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
	}
