package lecture14;

public class substringlengthwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String s = "nitin";
		printsubstring(s);
			}
			public static void printsubstring(String s) {
				for(int len=1;len<=s.length();len++) {
					for(int j=len;j<=s.length();j++) {
						int i=j-len;
						System.out.println(s.substring(i,j));
					}
				}
			}
}