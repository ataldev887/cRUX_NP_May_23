package lecture9;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,13,-4,5,7};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]+" ");
	}

}
	public static void sort(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			int mini =i;
			for (int j =i+1; j < arr.length; j++) {
				if(arr[j]<arr[mini]) {
					mini=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[mini];
			arr[mini]=temp;
		}
			
		}
	}
