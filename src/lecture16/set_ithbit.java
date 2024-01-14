package lecture16;

public class set_ithbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=86;
int pos=2;
System.out.println(setbit(n,pos));
	}
public static int setbit(int n,int pos) {
	int mask = (1<<pos);
	return n|mask;
}

}
