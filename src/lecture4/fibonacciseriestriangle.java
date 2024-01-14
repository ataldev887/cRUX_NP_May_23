package lecture4;

public class fibonacciseriestriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=6;
int a=0;
int b=1;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(a + " ");
        int temp = a + b;
        a = b;
        b = temp;
    }
    System.out.println();
}





	}

}
