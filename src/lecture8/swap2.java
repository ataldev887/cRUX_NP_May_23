package lecture8;

public class swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this will not swap
int [] arr= {10,20,30,40,50};
int [] other= {100,200,300,400,9};
System.out.println(arr[0]+" "+other[1]);
swap(arr,other);
System.out.println(arr[0]+" "+other[1]);
	}
	public static void swap(int[]arr,int[]other) {
		int [] temp=arr;
		arr=other;
		other=temp;
	}

}
