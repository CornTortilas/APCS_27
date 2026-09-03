/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
		double farenheit = input.nextInt();
        double celsius = (farenheit-32)*5/9;
        System.out.println("Farenheit = " + farenheit + "\nCelsius = " + celsius);
	}
}
