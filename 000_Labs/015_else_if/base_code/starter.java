/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int num = (int)(Math.random()*1000)+1;
		Scanner input = new Scanner(System.in);
		System.out.print("Pick a number from 1-1000: ");
		int guess = input.nextInt();
		if(guess == num){
			System.out.println("you got the number!");
		}
		else if(guess > num){
			System.out.println("Your number was larger than the number. The number was " + num + ".");
		}
		else{
			System.out.println("Your number was smaller than the number. The number was " + num + ".");
		}
		
	}
}
