package lecture8;

public class rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,2,3,4,5,6,7};
int k=3;
rotate(arr,k);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}
	public static void rotate(int[]arr,int k) {
		k=k%arr.length;
		for(int j=1;j<=k;j++) {
		int temp=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
		}
	}

}
