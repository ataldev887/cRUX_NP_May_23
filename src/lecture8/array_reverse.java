package lecture8;

public class array_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {1,34,56,781,11,-7,90};
reverse(arr);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}
	public static void reverse(int[]arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
