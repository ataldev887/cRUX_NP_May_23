package lecture17;

public class fact_tailrecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   int n=5;
                   System.out.println(fac(n,1));

	}
	public static int fac(int n, int ans) {
		if(n==1) {
			return ans;
		}
		return fac(n-1 , ans*n);
	}

}
