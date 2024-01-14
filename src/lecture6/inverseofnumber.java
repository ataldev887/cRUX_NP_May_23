package lecture6;
import java.util.*;
public class inverseofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int position=1;
		int sum=0;
		while(n>0){
			int rem = n%10;
			sum = (int) (sum + position * Math.pow(10,rem-1));
			n/=10;
			position++;
		}
		System.out.println(sum);
	}

}
