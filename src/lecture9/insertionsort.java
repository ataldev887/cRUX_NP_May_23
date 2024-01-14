package lecture9;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,13,-4,5,7};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}

}
	public static void sort(int[]arr) {
		for (int i = 1; i < arr.length; i++) {
			int picked=arr[i];//hand picked card
			int j=i-1;
			while(j>=0 && arr[j]>picked) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=picked;
		}
			
		}
	}
