/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your name");
		String name = input.nextLine();
		System.out.println("Please input the number of times you would like your name to be printed");
		int num = input.nextInt();
		int count = 0;
		System.out.println();
		while(count<num){
			System.out.println(name);
			count++;
		}



		
	}
}
