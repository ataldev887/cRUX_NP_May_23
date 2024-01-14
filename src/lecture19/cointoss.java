package lecture19;

public class cointoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
cointoss(n, "");
	}

	public static void cointoss(int n, String ans) {
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		cointoss(n - 1, ans + "H");
		cointoss(n - 1, ans + "T");
	}

}
