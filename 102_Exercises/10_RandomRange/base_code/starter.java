/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter 2 integers\n #1: ");
		int num1 = Input.nextInt();
		Input.nextLine();
		System.out.print("(Bigger than " + num1 +" )#2: ");
		int num2 = Input.nextInt();
		Input.nextLine();
		System.out.println("Your range is " + num1 + " to " + num2);
		System.out.println("Here are five numbers in that range");
		System.out.print(((int)(Math.random()*(num2-num1)+num1)) + ", ");
		System.out.print(((int)(Math.random()*(num2-num1)+num1)) + ", ");
		System.out.print(((int)(Math.random()*(num2-num1)+num1)) + ", ");
		System.out.print(((int)(Math.random()*(num2-num1)+num1)) + ", ");
		System.out.print(((int)(Math.random()*(num2-num1)+num1)));

	}
}
