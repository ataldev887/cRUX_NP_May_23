package lecture20;

public class leetcode386 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1000;
lexicographical(0,n);
	}
	public static void lexicographical(int curr, int n) {
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		int i=0;
		if(curr==0) {
			i=1;
		}
		for (; i <=9; i++) {
			lexicographical(curr*10+i,n);
		}
	}

}
