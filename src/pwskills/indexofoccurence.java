package pwskills;
import java.util.*;
public class indexofoccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("enter x");
		int x = sc .nextInt();

		System.out.println("index of x: " + countoccurence(arr,x));
			}
			public static int countoccurence(int[]arr , int x) {
				int countofindex =-1;
				for (int i = 0; i < arr.length; i++) {
					if(arr[i]==x) {
						countofindex=i;
					}
				}
				return countofindex;
			}
}
