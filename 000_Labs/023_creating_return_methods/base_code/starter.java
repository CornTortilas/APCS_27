/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int pow(int x, int y){
		int total = 1;
		for(int i = 0; i < y; i++){
			total *= x;
		}
		return total;
	}
	public static void main(String args[]) {
		System.out.println(pow(1,1));
		System.out.println(pow(121,0));
		System.out.println(pow(3,2));
		// Your code goes below here



		
	}
}
