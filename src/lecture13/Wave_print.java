package lecture13;

public class Wave_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]arr= {{1,2,3,4,5},{6,7,13,14,15},{23,24,36,78,11}};
display(arr);
	}
	public static void display(int[][]arr) {
		for(int col=0;col<arr[0].length;col++) {
			if(col%2==0) {
				for(int row=0;row<arr.length;row++) {
					System.out.print(arr[row][col]+" ");
				}
			}
			else {
				for(int row=arr.length-1;row>=0;row--) {
					System.out.print(arr[row][col]+" ");
				}
			}
		}
	}

}
