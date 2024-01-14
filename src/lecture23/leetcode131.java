package lecture23;
import java.util.*;
public class leetcode131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
		List<String> ll= new ArrayList<String>();
		List<List<String>> ans= new ArrayList<>();
		partitioning(ques, ll,ans);
		System.out.println(ans);
		
	}
	public static void partitioning(String ques, List<String>ll,List<List<String>>ans) {
		if (ques.length()==0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 1; i <=ques.length(); i++) {
			String s = ques.substring(0,i);
			if(Palindromic(s)) {
				ll.add(s);
			partitioning(ques.substring(i),ll,ans);
			ll.remove((ll.size()-1));
			}
		}
	}
		public static boolean Palindromic(String s) {
			int i = 0;
			int j = s.length() - 1;
			while (i < j) {
				if (s.charAt(i) != s.charAt(j)) {
					return false;
				}
				i++;
				j--;
			}
			return true;

		}

}