/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the guessing game!");
		System.out.println("Guess a number from 1-1000");
		int num  = (int)(Math.random()*1000)+1;
		int guess = 0;
		while(guess!=num){
			guess = input.nextInt();
			if(guess>num){
				System.out.println("Your guess was too high");
			}
			else{
				System.out.println("Your guess was too low");
			}
		}
		System.out.println("\nYOU DID IT!");



		
	}
}
