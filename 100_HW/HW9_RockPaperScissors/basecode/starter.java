/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    public static String getObject(){
        int rand = (int)(Math.random()*3);
        String[] objs = {"Rock","Paper","Scissors"};
        String obj = objs[rand];
        return obj;
    }

    public static int compare2(String choice, String enemy){
        if(choice.equals(enemy)){
            return 0;
        }
        else if(choice.equals("Rock")){
            if(enemy.equals("Paper")){
                return 2;
            }
            else{
                return 1;
            }
        }
        else if(choice.equals("Paper")){
            if(enemy.equals("Scissors")){
                return 2;
            }
            else{
                return 1;
            }
        }
        else{
            if(enemy.equals("Rock")){
                return 2;
            }
            else{
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean chose = false;
        String choice = "";
        String mode = "";
        String[] outcome = {"You tied","You win","You lose"};
        while(true){
        System.out.print("Do you want to play?(y/yes,n/no,done)");
        mode = input.nextLine();
        if(mode.equalsIgnoreCase("yes")||mode.equalsIgnoreCase("y")){
            while(!chose){  
            System.out.println("Rock, Paper, or Scissors?");
            choice = input.nextLine();
            if(choice.equals("Rock") || choice.equals("Paper") || choice.equals("Scissors")){
                chose = true;
            }
            else{
                System.out.println("Please try again. (Don't forget to capitalize!)");
            }
        }   
            String enemy = getObject();
            System.out.println("Rock, Paper, Scissors, Shoot!");
            System.out.println("Player: " + choice + "\nOpponent: " + enemy);
            System.out.println(outcome[compare2(choice, enemy)]);
        }
        else if(mode.equalsIgnoreCase("no")||mode.equalsIgnoreCase("n")){
            String enemy1 = getObject();
            String enemy2 = getObject();
            System.out.println("1: " + enemy1 + "\n2: " + enemy2);
            System.out.println(outcome[compare2(enemy1, enemy2)]);
            
        }
        else if(mode.equalsIgnoreCase("done")){
        System.out.println("See you later!");
        break;
        }
    }

    }
}
