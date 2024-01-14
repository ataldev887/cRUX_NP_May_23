package lecture16;

public class checck_ithbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=89;
int pos=2;
System.out.println(ithbit(n,pos));
	}
	public static boolean ithbit(int n, int pos) {
		n=n>>pos;
		if((n&1)==0) {
			return false;
		}else {
			return true;
		}
	}

}
