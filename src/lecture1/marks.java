package lecture1;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int m = 56;
    if(m>=75) {
	System.out.print("GRADE A");
    }
	else if(m>=65 && m<75) {
		System.out.println("GRADE B");
	}
	else if(m>=55 && m<65) {
		System.out.println("GRADE C");
	}
	else if(m>=45 && m<55) {
		System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
}
	}


