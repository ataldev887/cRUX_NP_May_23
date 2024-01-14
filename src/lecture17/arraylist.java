package lecture17;
import java.util.ArrayList;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		//add
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,40); //index ka range hoga 0 to size agar fetch karna hoga toh range hoga 0 to size-1
		list.add(80);
		list.add(90);
		System.out.println(list);
		//size
		System.out.println(list.size());
		//get
		System.out.println(list.get(2));
		//remove
		System.out.println(list.remove(1));
		System.out.println(list);
		//update
		list.set(2, -11);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		for(int val:list) {
			System.out.print(val+" ");
		}
	}

}
