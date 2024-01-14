package pwskills;
import java.util.*;
public class firstrepeatingnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}

		System.out.println("first repeating number: " + repeatingnumber(arr));
			}
			public static int repeatingnumber(int[]arr) {
				for (int i = 0; i < arr.length; i++){
					for (int j = i+1; j < arr.length; j++) {
					if(arr[i]==arr[j]) {
						return arr[i];
					}
				}
					}
				return -1;
			}
}
