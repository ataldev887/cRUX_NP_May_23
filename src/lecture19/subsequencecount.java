package lecture19;

public class subsequencecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		System.out.println("\n"+print(ques,""));
	}
	static int count = 0;

	public static int print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		char ch = ques.charAt(0);
		int a = print(ques.substring(1), ans);
		int b = print(ques.substring(1), ans + ch);
		return a+b;
	}
	}
