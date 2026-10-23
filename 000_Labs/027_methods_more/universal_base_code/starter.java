/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner input = new Scanner(System.in);
		BankAccount x;
		System.out.println("Welcome to Sammy's ATM!");
		System.out.println("Would you like to make an account? (y/n)");
		if(input.nextLine().equalsIgnoreCase("y")){
			System.out.println("Would you like to input your name and balance, name, or nothing at all?(1,2,3)" );
			int choice = input.nextInt();
			input.nextLine();
			if(choice==1){
				System.out.print("Please input your name: ");
				String n = input.nextLine();
				System.out.print("Please input your balance: ");
				int b = input.nextInt();
				x = new BankAccount(n,b);
				System.out.println("Account created successfully!");
			}
			else if(choice==2){
				System.out.print("Please input your name: ");
				String n = input.nextLine();
				x = new BankAccount(n);
				System.out.println("Account created successfully!");
			}
			else{
				x = new BankAccount();
				System.out.println("Account created successfully!");
			}
			System.out.println("\n----------------");
			x.info();
			x.checkBalance();
			
		}
	}
}
