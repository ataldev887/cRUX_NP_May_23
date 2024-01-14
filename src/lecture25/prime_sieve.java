package lecture25;

import java.util.Arrays;

public class prime_sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=100;
printprime(n);
	}
	// tc N(log(log(N)))
	// sc O(n)
	public static void printprime(int n) {
		boolean []prime = new boolean[n+1];
		Arrays.fill(prime, true);
		prime[0]=false;
		prime[1]=false;
		for (int i = 2; i*i <= prime.length; i++) {
			if(prime[i]) {
				for (int j = 2; i*j < prime.length; j++) {
					prime[i*j]=false;
				}
			}
		}
		for (int i = 2; i < prime.length; i++) { //loop to check true or false
			if(prime[i]) {
				System.out.print(i+" ");
			}
			
		}
	}

}
