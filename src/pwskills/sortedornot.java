package pwskills;

import java.util.*;

public class sortedornot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Is Sorted " + Sortedornot(arr));
			}
			public static boolean Sortedornot(int[]arr) {
				boolean check = true;
				for (int i = 1; i < arr.length; i++) {
					if(arr[i]<arr[i-1]) {
						check = false;
						break;
					}
				}
				return check;
	}

}
