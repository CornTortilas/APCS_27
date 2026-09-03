/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
        String name = input.nextLine(); 
        System.out.println("What is your age?(#)");
        int age = input.nextInt();
        System.out.println("What month were you born?(1-12)");
        int month = input.nextInt();
        System.out.println("What day were you born?(1-31)");
        int day = input.nextInt();
        System.out.println("What year were you born?(0-2026)");
        int year = input.nextInt();
        System.out.println("If I have a dollar and two quarters, how much money is that?(#.##)");
        double money = input.nextDouble(); 
        System.out.println("You were born on " + month + "/" + day + "/" + year);
        System.out.println("You are " + age + " years old, and your name is " + name);
        System.out.println("You have $" + money + " in your wallet");   
	}
}
