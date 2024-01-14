package lecture8;

public class linear_sarch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {1,34,56,78,11,-7,90};
System.out.println(search(arr,56));
	}
	public static int search(int[]arr,int item) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
	}

}
