/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] arr = new int[1001];
		for(int i = 0; i<arr.length; i++){
			arr[i] = 3*(i+1);
			System.out.print(arr[i]);
			if(i!=1000){
				System.out.print(", ");
			}
			System.out.println();
		}
		for(int i = 0; i<arr.length; i++){
			arr[i] = 1000-i;
			System.out.print(arr[i]);
			if(i!=1000){
				System.out.print(", ");
			}
		}
	}
}
