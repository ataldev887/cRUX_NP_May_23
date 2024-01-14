package lecture16;

public class leetcode136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {4,1,2,1,2};
		System.out.println(singlenumber(arr));
	}
	public static int singlenumber(int[]arr) {
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		return ans;
	}

}
