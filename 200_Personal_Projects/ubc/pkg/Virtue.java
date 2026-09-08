package pkg;

import java.util.*;

public class Virtue {
	public String Name;
	public Move[] Moves;
	public double Health;
	public double MaxHealth;
	//Strike Pierce Fire Ice Wind Elec Psy Light Dark
	String[] Affinities;

	public Virtue(String Name, Move[] Moves, double MaxHealth, String[] Affinities) {
		this.Name = Name;
	 	this.Moves = Moves;
		this.MaxHealth = MaxHealth;
		this.Health = MaxHealth;
        this.Affinities = Affinities;
	}

	public void AttackEnemy(Move move, Enemy enemy){
		System.out.println(Name + " attacked " + enemy.Name + " with " + move.Name);
		enemy.HitByMove(move,this);	
	}

	public void ChangeMove(Move newMove, int whichMove){
		System.out.println("Changed " + Name + "'s " + Moves[whichMove].Name + " to " + newMove.Name);
		Moves[whichMove] = newMove;
	}

	public void PrintHealth(){
		System.out.println("Max Health: " + MaxHealth + " Current Health: " + Health);
	}
}