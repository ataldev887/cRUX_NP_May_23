package lecture8;

public class maxinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,34,56,78,11,-7,90};
		System.out.println(max2(arr));
			}
	
	public static int max2(int[]arr) {
		int m=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			//if(arr[i]>m) {
			//	m=arr[i];
			//}
			m=Math.max(m,arr[i]);
		}
		return m;
	}
	
			public static int max(int[]arr) {
				int m=arr[0];
				for(int i=0;i<arr.length;i++) {
					//if(arr[i]>m) {
					//	m=arr[i];
					//}
					m=Math.max(m, arr[i]);
				}
				return m;
			}
	}
