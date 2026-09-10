package pkg;

import java.util.*;

import javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler;

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

	public int ChooseVirtue(Virtue[] Options){
		int choice = 0;
		int i = 1;
		Scanner input = new Scanner(System.in);
		for(Virtue Option : Options){
			System.out.println(i + ". " + Option.Name);
			i++;
		}
		choice = input.nextInt();
		input.nextLine();
		input.close();
		return choice-1;
	}
	public Virtue TargetVirtue(Move move, Virtue[] Virtues, Virtue[] Enemies){
		if(move.BaseDamage == 0.0){
			return Virtues[ChooseVirtue(Virtues)];
		}
		else{
			return Enemies[ChooseVirtue(Enemies)];
		}
	}
	public void AttackEnemy(Move move, Virtue enemy){
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

	public void HitByMove(Move move, Virtue virtue){
		if(Health == 0){
			System.out.println(Name + " is already dead!");
			System.out.println();
			return;
		}
		Health -= move.FindDamage(virtue,this);
		if(Health <= 0){
			Health = 0;
		}
		move.FindDamageEffects(virtue,this);
		System.out.println(Name + " took " + move.FindDamage(virtue,this) + " Damage");
		if(Health == 0){
			System.out.println(Name + " died!");
		System.out.println();
		}
	}
}