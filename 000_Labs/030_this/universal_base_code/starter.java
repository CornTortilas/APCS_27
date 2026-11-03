/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf Guido_Mista = new PooleDwarf(randName(),((int)(Math.random()*20+30)));
		PooleDwarf Number1 = new PooleDwarf(randName(),((int)(Math.random()*20+30)));
		PooleDwarf Number2 = new PooleDwarf(randName(),((int)(Math.random()*20+30)));
		PooleDwarf Number3 = new PooleDwarf(randName(),((int)(Math.random()*20+30)));
		PooleDwarf Number5 = new PooleDwarf(randName(),((int)(Math.random()*20+30)));
		PooleDwarf Number6 = new PooleDwarf(randName(),((int)(Math.random()*20+30)));
		PooleDwarf Number7 = new PooleDwarf(randName(),((int)(Math.random()*20+30)));
		int count = 0;
		if(Guido_Mista.getName().equals(Number1.getName())){
			count++;
		}
		if(Guido_Mista.getName().equals(Number2.getName())){
			count++;
		}
		if(Guido_Mista.getName().equals(Number3.getName())){
			count++;
		}
		if(Guido_Mista.getName().equals(Number5.getName())){
			count++;
		}
		if(Guido_Mista.getName().equals(Number6.getName())){
			count++;
		}
		if(Guido_Mista.getName().equals(Number7.getName())){
			count++;
		}
		System.out.print(count);
		System.out.print(" " + ((count == 0 || count > 1)? "dwarves":"dwarf"));
		System.out.println(" had the same name as " + Guido_Mista.getName() + ",the first dwarf");
	}
}
