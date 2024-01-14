package lecture11;
import java.util.*;
public class aggressivecow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
	int t=sc.nextInt();
while(t>0) {
	int nos = sc.nextInt();
	int noc = sc.nextInt();
	int[]stall=new int[nos];
	for(int i=0;i<stall.length;i++) {
		stall[i]=sc.nextInt();
	}
	Arrays.sort(stall);
	System.out.println(maxdistance(stall, noc));
	t--;
}
	}
	public static int maxdistance(int[] stall,int noc) {
		int lo=stall[0];
		int hi=stall[stall.length-1];
		int ans =0;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(issafe(stall,noc,mid)==true) {
				ans = mid;
				lo = mid +1;
			}else {
				hi=mid-1;
			}
		}
		return ans;
	}
	public static boolean issafe(int[] stall,int noc,int mid) {
		int cow =1;
		int pos=stall[0];
		for(int i=1;i<stall.length;i++) {
			if(stall[i]-pos>=mid) {
				cow++;
				pos = stall[i];
			}
			if(cow==noc) {
				return true;
			}
		}
		return false;
	}

}
