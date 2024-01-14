package lecture16;

public class leetcode191 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=119;
		System.out.println(fastcountset(n));
			}
			public static int fastcountset(int n) {
				int count =0;
				while(n!=0) {
						count++; 
						n=n&(n-1);
					n>>=1;
				}
				return count;
	}

}
