/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner Input = new Scanner(System.in);
		System.out.println("What is your name?");
		String Name = Input.nextLine();
		System.out.println("What is your title? ex. Slayer of Dragons");
		String Title = Input.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		boolean hasClass = false;
		String Class = "";
		while(!hasClass){
			Class = Input.nextLine();
			if(Class.equalsIgnoreCase("wizard")){
				System.out.println("You've chosen the Wizard! Excelsior!");
				hasClass = true;
			}
			else if(Class.equalsIgnoreCase("warrior")){
				System.out.println("You've chosen the Warrior! For honor!");
				hasClass = true;
			}
			else if(Class.equalsIgnoreCase("Rogue")){
				System.out.println("You've chosen the Rogue! How cunning!");
				hasClass = true;
			}
			else{
				System.out.println("Please choose a role.");
			}
		}
		System.out.println();
      	System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		int PointsLeft = 20;
		int[] SkillPoints = new int[5];
    	String[] SkillNames = {"Strength","Dexterity","Intelligence","Constitution","Charisma"};
		for(int i = 0;i < SkillPoints.length; i ++){
		boolean PointsUsed = false;
			if(PointsLeft == 0){
				break;
			}
			while(!PointsUsed){
				System.out.println("Points left: " + PointsLeft);
				System.out.println("How many points would you like to put into " + SkillNames[i] + "? (0-10)");
				int Points = Input.nextInt();
				if(PointsLeft >= Points && Points >= 0 && Points <= 10){
					SkillPoints[i] = Points;
					PointsLeft -= Points;
					PointsUsed = true;
				}
				else{
					System.out.println("Not enough skill points, try again");
				}
				System.out.println("--------------------------------------------------");
    
			}
		}
		System.out.println("You are " + Name + ", the " + Title + " of CVHS.");
    	System.out.println("You're a " + Class + " with the following stats!");
   		for(int i = 0;i < SkillNames.length; i++){
			System.out.println(SkillNames[i] + "-" + SkillPoints[i]);
		}
    	System.out.println("");
    	System.out.println("Good luck on your quest " + Name + "!");
	}
}