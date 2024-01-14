package lecture26;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sc O(n)
int []arr= {7,5,3,2,1};
int []ans = merge(arr,0,arr.length-1);
for (int i = 0; i < ans.length; i++) {
	System.out.print(ans[i]+" ");
}

	}
public static int [] merge(int []arr, int si,int ei) {
	if(si==ei) {
		int []bs = new int [1];
		bs [0]=arr[si];
		return bs;
	}
	int mid = (si+ei)/2;
	int []f=merge(arr,si,mid);
	int []s=merge(arr,mid+1,ei);
	return Merge(f,s);
}
public static int[] Merge(int[] arr1, int[] arr2) {
	int[] ans = new int[arr1.length + arr2.length];
	int i = 0;
	int j = 0, k = 0;
	while (i < arr1.length && j < arr2.length) {
		if (arr1[i] < arr2[j]) {
			ans[k] = arr1[i];
			k++;
			i++;
		} else {
			ans[k] = arr2[j];
			k++;
			j++;
		}
	}
	while (i < arr1.length) {
		ans[k] = arr1[i];
		k++;
		i++;
	}
	while (j < arr2.length) {
		ans[k] = arr2[j];
		k++;
		j++;
	}
	return ans;
}
}