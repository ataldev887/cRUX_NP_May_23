package lecture6;
import java.util.*;
public class conversiontemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int minf = sc.nextInt();
int maxf = sc.nextInt();
int steps = sc.nextInt();
for(int i=minf; i<=maxf; i+=steps) {
	int c =(int) ((5.0/9.0)*(i-32));
	System.out.println(i + "\t" + c);
}
	}

}
