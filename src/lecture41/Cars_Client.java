package lecture41;

public class Cars_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars[] arr = new Cars[5];
		arr[0] = new Cars(200, 10, "White");// price speed color
		arr[1] = new Cars(1000, 20, "Black");
		arr[2] = new Cars(345, 3, "Yellow");
		arr[3] = new Cars(34, 89, "Grey");
		arr[4] = new Cars(8907, 6, "Red");
		Sort(arr);
		Display(arr);
	}
	public static <t> void Display(t arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	public static<T extends Comparable <T>> void Sort(T[] arr) {
		for (int trun = 1; trun < arr.length; trun++) {
			for (int i = 0; i < arr.length - trun; i++) {
				if (arr[i].compareTo(arr[i+1])>0) {
					T t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
}
			}
		}
	}
}
