package lecture7;

import java.util.*;

public class array_demo_part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i <n; i++) {
			arr[i] = sc.nextInt();
		}

		display(arr);
	}

	public static void display(int[] arr) {
		for (int i = 0; i <arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
