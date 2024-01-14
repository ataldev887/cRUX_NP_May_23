package assignment3;
import java.util.*;
public class inverseofanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
			        int n = sc.nextInt();
			        int []arr = new int[n];
			        for(int i = 0;i<n;i++){
			                arr[i] = sc.nextInt();
			        }
		int []ans =inverse(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
			}
		    }
			public static int[] inverse(int[]arr) {
				int []inv = new int[arr.length];
		        for(int i=0;i<arr.length;i++){
		            int val=arr[i];
		            inv[val]=i;
		        }
		        return inv;
				}
		    }

