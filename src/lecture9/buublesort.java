package lecture9;

public class buublesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {2,5,-4,13};
sort(arr);
for (int i = 0; i < arr.length; i++) {
System.out.println(arr[i]+" ");	
}
	}
	
	public static void sort(int[]arr) {
		for(int turn=1;turn<arr.length;turn++) {
			for(int i=0;i<arr.length-turn;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					
				}
			}
		}
	}

}
