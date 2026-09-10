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
		Move chosenMove = virtue.Moves[ChooseMove(virtue.Moves)];
		Virtue chosenVirtue = virtue.TargetVirtue(chosenMove,Virtues,Enemies);
		virtue.AttackEnemy(chosenMove, chosenVirtue);
	}

	public static void main(String args[]) {
		String[][] AffinityList = {
		//Strike,Pierce,Fire,Ice,Wind,Elec,Psy,Light,Dark
				{"","Wk","Str","Wk","","","","",""},
				{"","","Wk","Nul","","Str","","",""}
		};
		Move[] MoveList = new Move[2];
		//Strike0,Pierce1,Fire2,Ice3,Wind4,Elec5,Psy6,Light7,Dark8
		MoveList[0] = new Move(1.0,"Bash",0,0);
		MoveList[1] = new Move(1.0,"Shoot",1,1);
		Virtue[] VirtueList = new Virtue[2];
		VirtueList[0] = new Virtue("Jack o'Lantern",MoveList,1.0,AffinityList[0]);
		VirtueList[1] = new Virtue("Jack Frost",MoveList,1.0,AffinityList[1]);
		Virtue[] EnemyList = new Virtue[2]; 
		Virtue enemy = VirtueList[0];
		EnemyList[0] = enemy;
		Virtue[] PlayerVirtueList = new Virtue[1];
		Virtue virtue = VirtueList[1];
		PlayerVirtueList[0] = virtue;
		AttackProcess(virtue, PlayerVirtueList, EnemyList);

		//TODO: add enemy ai
	}
}
