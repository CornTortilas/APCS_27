/*
 *	Author: Sammy Durbas
 *  Date: Sammy Durbas 'o clock
 * 	Collaborator: Me, Myself, and I
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner Input = new Scanner(System.in);
		int num = (int)(Math.random()*3);
		String[] Things = {"jjba","potato","polygon"};
		String[] Hints1 = {"It's a show (answer in its abbreviation)","It's a vegetable","It's a shape"};
		String[] Hints2 = {"Different characters have the same name","It's the best vegetable","What mario is made of in mario 64"};
		System.out.println(Hints1[num]);
		System.out.print("Guess! ");
		String Guess = Input.nextLine();
		if(Guess.equalsIgnoreCase(Things[num])){
			System.out.println("You got it! The answer was " + Things[num]);
		}
		else{
			System.out.println("Not exactly, but maybe this hint will help!\n" + Hints2[num]);
			System.out.print("\nTry guessing again! ");
			Guess = Input.nextLine();

			if(Guess.equalsIgnoreCase(Things[num])){
				System.out.println("You got it! The answer was " + Things[num]);
			}
			else{
				System.out.println("Not quite, the answer was " + Things[num]);
			}
		}
		Input.close();

	}
}
