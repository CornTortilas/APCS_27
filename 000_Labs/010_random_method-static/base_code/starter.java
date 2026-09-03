    /*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    public static int inclusiveRandom(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static double exclusiveRandom(double min, double max){
        return (Math.random()*(max-min)+min);
    }
	public static void main(String args[]) {
		System.out.print(inclusiveRandom(0,9)+" "+inclusiveRandom(1,100)+" "+exclusiveRandom(2.5,3.5)+" "+exclusiveRandom(14,589));
	}
}
