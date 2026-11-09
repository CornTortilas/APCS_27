/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean isPrime(int n){
		if(n%2==0 && n!=2 || n==1){
			return false;
		}
		for(int i=3;i<n;i+=2){
			if(n%i==0){
				return false;
			}
		}

		return true;
	}
	
	public static void printPrimes(int n){
		n--;
		while(n>0){
			if(isPrime(n)){
				System.out.print(n);
				if(n>2){
					System.out.print(", ");
				}
			}
			n--;
		}
	}
	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
    	System.out.print("Input a number and I'll print out every prime until that number: ");
		printPrimes(input.nextInt());
	}
}
