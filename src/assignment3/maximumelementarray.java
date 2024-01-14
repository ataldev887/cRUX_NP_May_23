package assignment3;
import java.util.*;
public class maximumelementarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}

		Arrays.sort(arr);
		int count =1;
		int countofmajority=0;

		for(int i=1;i<arr.length;i++){
		    if(arr[i-1]==arr[i]){
		        count++;
		    }
		    else{
		        if(count>(n/3)){
		            System.out.print(arr[i-1]+" ");
		            countofmajority++;
		        }
		        count=1;
		    }
		}
		//when there is no next element
		if(count>(n/3)){
		    System.out.print(arr[arr.length-1]);
		    countofmajority++;
		}
		if(countofmajority==0){
		    System.out.print("No Majority Elements");
		}
		    }
	}

