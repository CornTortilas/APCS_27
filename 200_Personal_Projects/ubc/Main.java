/*
 *	Author:  
 *  Date: 
*/
import pkg.*;
import java.util.*;

class Main {
	
	public static int Choose(String[] Options){
		int choice = 0;
		int i = 1;
		Scanner input = new Scanner(System.in);
		for(String Option : Options){
			System.out.println(i + ". " + Option);
			i++;
		}
		choice = input.nextInt();
		input.nextLine();
		return choice-1;
	}
	public static int ChooseMove(Move[] Options){
		int choice = 0;
		int i = 1;
		Scanner input = new Scanner(System.in);
		for(Move Option : Options){
			System.out.println(i + ". " + Option.Name);
			i++;
		}
		choice = input.nextInt();
		input.nextLine();
		return choice-1;
	}
	public static void AttackProcess(Virtue virtue, Virtue[] Virtues, Virtue[] Enemies){
		if(virtue.Health == 0){
			return;
		}
        else{
            System.out.println("\nYour Turn!\n");
        }
		if(virtue.status == 1){
			System.out.println(virtue.Name + " is stunned");
			return;
		}
		Move chosenMove = null;
		if(virtue.status == 2){
			boolean UsableMove = false;
			while(!UsableMove){
				chosenMove = virtue.Moves[ChooseMove(virtue.Moves)];
				if(chosenMove.BaseDamage > 0.0){
					UsableMove = true;
				}
			}
		}
		else{
			chosenMove = virtue.Moves[ChooseMove(virtue.Moves)];
		}
		
		Virtue chosenVirtue = virtue.TargetVirtue(chosenMove,Virtues,Enemies);
		virtue.AttackEnemy(chosenMove, chosenVirtue);
        virtue.EndTurnEffects();
		virtue.PrintHealth();
	}
	public static void EnemyAttackProcess(Virtue enemy, Virtue[] Virtues, Virtue[] Enemies){
		if(enemy.Health == 0){
			return;
		}
        else{
            System.out.println("\nEnemy Turn!\n");
        }
        if(enemy.status == 1){
            enemy.EndTurnEffects();
            System.out.println(enemy.Name + " is stunned");
            return;
        }
		double MostDamage = 0;
		int whichMove = 0;
		int whichTarget = 0;
		for(int i = 0; i < enemy.Moves.length; i++){
			for(int j = 0; j < Virtues.length; j++){
				if(enemy.Moves[i].FindDamage(enemy, Virtues[j]) > MostDamage){
					if(MostDamage == 0 || (int)Math.random()*100 <= 75){
						MostDamage = enemy.Moves[i].FindDamage(enemy, Virtues[j]);
						whichMove = i;
						whichTarget = j;
					}
				}
			}
		}
		enemy.AttackEnemy(enemy.Moves[whichMove], Virtues[whichTarget]);
        enemy.EndTurnEffects();
		enemy.PrintHealth();
	}

	public static void main(String args[]) {
		String[][] AffinityList = {
		//Strike,Pierce,Fire,Ice,Wind,Elec,Psy,Light,Dark
				{"","Wk","Str","Wk","","","","",""},
				{"","","Wk","Nul","","Str","","",""}
		};
        String[] StatusList = {"","Stun","Rage","Charm","Confuse","Regen"};
		Move[] MoveList = new Move[3];
		//Strike0,Pierce1,Fire2,Ice3,Wind4,Elec5,Psy6,Light7,Dark8
		MoveList[0] = new Move(20.0,"Bash",0,0,0);
		MoveList[1] = new Move(20.0,"Shoot",1,0,0);
        MoveList[2] = new Move(0.0, "Regen",0,5,2);
		Virtue[] VirtueList = new Virtue[2];
		VirtueList[0] = new Virtue("Jack o'Lantern",MoveList,100.0,AffinityList[0],StatusList);
		VirtueList[1] = new Virtue("Jack Frost",MoveList,100.0,AffinityList[1],StatusList);
		Virtue[] EnemyList = new Virtue[1]; 
		Virtue enemy = VirtueList[0];
		EnemyList[0] = enemy;
		Virtue[] PlayerVirtueList = new Virtue[1];
		Virtue virtue = new Virtue(VirtueList[0]);
		PlayerVirtueList[0] = virtue;
        while(virtue.Health > 0.0 && enemy.Health > 0.0){
		AttackProcess(PlayerVirtueList[0], PlayerVirtueList, EnemyList);
		EnemyAttackProcess(EnemyList[0], PlayerVirtueList, EnemyList);
		
        }
		if(virtue.Health == 0.0){
			System.out.println();
			System.out.println("YOU LOSE");
			System.out.println();
		}
		//TODO: add statuses to moves and virtues
	}
}
    