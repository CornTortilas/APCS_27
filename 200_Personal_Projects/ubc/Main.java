/*
 *	Author:  
 *  Date: 
*/

import java.text.AttributedCharacterIterator.Attribute;

import pkg.*;


class Main {
	public static void main(String args[]) {
		String[][] AffinityList = {
		//Strike,Pierce,Fire,Ice,Wind,Elec,Psy,Light,Dark
				{"","Wk","Str","Wk","","","","",""},
				{"","","Wk","Nul","","Str","","",""}
		};
		Move[] MoveList = new Move[2];
		//Strike0,Pierce1,Fire2,Ice3,Wind4,Elec5,Psy6,Light7,Dark8
		MoveList[0] = new Move(1.0,"Bash",0);
		MoveList[1] = new Move(1.0,"Shoot",1);
		Virtue[] VirtueList = new Virtue[2];
		VirtueList[0] = new Virtue("Jack o'Lantern",MoveList,1.0,AffinityList[0]);
		VirtueList[1] = new Virtue("Jack Frost",MoveList,1.0,AffinityList[1]);
		Virtue e = VirtueList[0];
		Virtue v = VirtueList[1];
		v.AttackEnemy(v.Moves[1], e);
		v.AttackEnemy(v.Moves[1], e);
		//TODO: Add choosing from multiple moves with a menu, then multiple enemies
	}
}
