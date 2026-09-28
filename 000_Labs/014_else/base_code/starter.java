/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner Input = new Scanner(System.in);
		System.out.print("Guess a number: ");
		int guess = Input.nextInt();
		int num = (int)(Math.random()*1000)+1;
		System.out.println("\n");
		if(guess == num){
			System.out.print("HOW???");
		}
		else{
			System.out.print("Incorrect, the number was actually " + num);
		}
	}
}
