package lecture30;
import java.util.Stack;
import java.util.*;
public class Element_bottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				Stack<Integer> st = new Stack<>();
				st.push(10);
				st.push(20);
				st.push(30);
				st.push(40);
				st.push(50);
				System.out.println(st);
				Element(st, n);
				System.out.println(st);
				sc.close();
			}

			public static void Element(Stack<Integer> st, int item) {
				if (st.isEmpty()) {
					st.push(item);
					return;
				}
				int x = st.pop();
				Element(st, item);
				st.push(x);
			}

}
