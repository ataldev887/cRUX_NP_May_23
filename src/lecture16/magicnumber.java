package lecture16;

public class magicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=6;
System.out.println(magicnumber(n));
	}
	public static int magicnumber(int n) {
		int mul=5;
		int ans =0;
		while(n!=0) {
			if((n&1)!=0) {
				ans +=mul;
			}
			mul= mul*5;
			n>>=1;
		}
		return ans;
	}

}
