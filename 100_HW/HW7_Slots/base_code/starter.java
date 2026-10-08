/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner Input = new Scanner(System.in);
		int money = 100;
		int wager = money + 1;
		int rand1;
		int rand2;
		int rand3;
		System.out.println("Slot Machine Rules: ");
    	System.out.println("1. Each player starts with $100.");
    	System.out.println("2. Input a wager less than your total amount of money.");
    	System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
    	System.out.println("   b. If three numbers match, you triple your money.");
    	System.out.println("   c. If none match, you lose your money.");

      	while(true) {
        	System.out.println("--------------------------------------------------");
        	System.out.println();
        	System.out.print("Would you like to play the slots? (Y/y/yes/Yes) : ");
			String choice = Input.nextLine();
			if(choice.equalsIgnoreCase("y")||choice.equalsIgnoreCase("yes")){
				System.out.println();
            	System.out.println("Great! Let's play!!!");
				while(wager >  money){
					System.out.println("What will you wager?");
					wager = Input.nextInt();
					if(wager > money){
						System.out.println("Wager  too high");
					}
				}
            	System.out.println("Your rolls are: ");
            	rand1 =  (int)(Math.random()*10)+ 1;
            	rand2 =  (int)(Math.random()*10)+ 1;
            	rand3 =  (int)(Math.random()*10)+ 1;
            	System.out.println("_______________________");
            	System.out.println(" | " + rand1 + " | " + rand2 + " | " + rand3 + " |");
            	System.out.println("_______________________");
				if(rand1==rand2 && rand2 == rand3){
               		money += wager * 2;
               		System.out.println("JACKPOT! You're wager has now been tripled!");
               		System.out.println("You now have $" + money + ".");
           		} else if (rand1 == rand2 || rand2 == rand3 || rand1 == rand3) {
               		money += wager;
               		System.out.println("You won! You're wager has now been doubled!");
               		System.out.println("You now have $" + money + ".");
            	} else {
					money -= wager;
               		System.out.println("Didn't win this time, better luck next time!");
               		System.out.println("You now have $" + money + ".");
               		
				}
			}
		}
	}
}
