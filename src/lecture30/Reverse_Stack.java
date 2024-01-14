package lecture30;
import java.util.Stack;
public class Reverse_Stack {
			public static void main(String[] args) {
				Stack<Integer>st=new Stack<>();
				st.push(10);
				st.push(20);
				st.push(30);
				st.push(40);
				st.push(50);
				System.out.println(st);
				Rev(st);
				System.out.println(st);
			}
			private static void Rev(Stack<Integer>st) {
				if(st.isEmpty()) {
					return;
				}
				int x=st.pop();
				Rev(st);
				Element(st,x);
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
