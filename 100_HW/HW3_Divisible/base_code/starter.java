/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static boolean D(int num, int num1){
		if(num%num1==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[]) {
		Scanner Input = new Scanner(System.in);
		int[] ints = new int[2];
		for(int i=0;i<2;i++){
			System.out.print("Enter an integer: ");
			ints[i] = Input.nextInt();
			Input.nextLine();
		}
		int d;
		for(int i = 0; i < 2; i++){
			d = 2;
			if(D(ints[i],d)){
				System.out.println(ints[i]+" is divisible by " + d);
			}
			else{
				System.out.println(ints[i]+" is not divisible by " + d);
			}
			d = 3;
			if(D(ints[i],d)){
				System.out.println(ints[i]+" is divisible by " + d);
			}
			d = 4;
			if(D(ints[i],d)){
				System.out.println(ints[i]+" is divisible by " + d);
			}
			d = 5 ;
			if(D(ints[i],d)){
				System.out.println(ints[i]+" is divisible by " + d);
			}
			if(D(ints[i],3) && D(ints[i],4) && D(ints[i],5)){
				System.out.println(ints[i] + " is divisible by 3,4, & 5");
			}
		}
	}
}
