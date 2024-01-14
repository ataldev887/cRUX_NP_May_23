package lecture19;

import java.util.*;

public class generate_parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
List<String> ll = new ArrayList<>();
generateparentheses(n,0,0,"",ll);
System.out.println(ll);
	}
	public static void generateparentheses(int n,int open, int close, String ans, List<String> ll) {
		if(open==n && close==n) {
			ll.add(ans);
			return;
		}
		if(open<n) {
		generateparentheses(n,open+1,close,ans + "(",ll);
		}
		if(close<open) {
		generateparentheses(n,open,close+1,ans + ")",ll);
		}
	}

}
