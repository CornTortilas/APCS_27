/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Would you like to Live, Laugh, or Love?"); 
		Scanner input = new Scanner(System.in);
		String choice = input.nextLine();
		if(choice.equalsIgnoreCase("Live")){
			System.out.print("You have chosen Live. May you live forever!");
		}
		else if(choice.equalsIgnoreCase("Laugh")){
			System.out.print("You have chosen Laugh. Comedy gold!");
		}
		else if(choice.equalsIgnoreCase("Love")){
			System.out.print("You have chosen Love. How heartwarming!");
		}
		else{
			System.out.print("Maybe run it back one more time");
		}
	}
}
