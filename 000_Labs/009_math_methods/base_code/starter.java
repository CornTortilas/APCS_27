/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int x = input.nextInt();
        System.out.print("Input a number: ");
        int y = input.nextInt();
        System.out.println("Maximum: " + Math.max(x,y));
        System.out.println("Square Root Of Y: " + Math.sqrt(y));
        System.out.println("X To The Power Of Y " + Math.pow(x,y));
	}
}
