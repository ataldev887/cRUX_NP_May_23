package pwskills;
import java.util.*;
public class countoccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int[]arr = new int[n];
for (int i = 0; i < arr.length; i++) {
	arr[i]=sc.nextInt();
}
System.out.print("enter x");
int x = sc .nextInt();

System.out.println("count of x: " + countoccurence(arr,x));
	}
	public static int countoccurence(int[]arr , int x) {
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==x) {
				count++;
			}
		}
		return count;
			}

}
