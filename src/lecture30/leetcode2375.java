package lecture30;
import java.util.Stack;
public class leetcode2375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "IIIDIDDD";
System.out.println(Smallest_Number(str));

	}
	public static String Smallest_Number(String str) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[str.length()+1];
			int count =1;
			for(int i=0;i<=str.length();i++) {
			if(i==str.length() || str.charAt(i)=='I') {
				ans[i]=count;
				count++;
				while(!st.isEmpty()) { //this gives information whether stack is empty or not
					ans[st.pop()]=count;
					count ++;
				}
			}		
				else {
					st.push(i);
				}
			}
		String s="";
		for (int i = 0; i < ans.length; i++) {
			s=s+ans[i];
		}
		return s;
		}
}