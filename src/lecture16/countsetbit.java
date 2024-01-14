package lecture16;

public class countsetbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=119;
System.out.println(countset(n));
	}
	public static int countset(int n) { //set bit means 1 on that place and we have to count how many 1s are present
		int count =0;
		while(n!=0) {
			if((n&1)!=0) {
				count++; //if we get 1 we will increse the count
			}
			n>>=1; //otherwise we will drop the bit ie 0
		}
		return count;
	}

}
