/*
 *	Author:  
 *  Date: 
*/
package pkg;

import java.util.*;


public class Move{
	public double BaseDamage;
	public String Name;
	public int Affinity;
	private String[] AffinityList = {"Strike","Pierce","Fire","Ice","Wind","Elec","Psy","Light","Dark"};
	int status;
	//double Accuracy

	public Move(double BaseDamage, String Name, int Affinity, int status){
		this.BaseDamage = BaseDamage;
		this.Name = Name;
		this.Affinity = Affinity;
		this.status = status;
		//this.Accuracy = Accuracy;
	}

	public double FindDamage(Virtue virtue, Virtue enemy){
		double Damage = BaseDamage;
		if(virtue.Affinities[Affinity].equals("Str")){
			Damage *= 1.2;
		}
		else if(virtue.Affinities[Affinity].equals("Nul")){
			Damage *= 1.5;
		}
		if(enemy.Affinities[Affinity].equals("Wk")){
			Damage *= 2;
		}
		else if(enemy.Affinities[Affinity].equals("Str")){
			Damage /= 2;
		}
		else if(enemy.Affinities[Affinity].equals("Nul")){
			Damage = 0;
		}
		return Damage;
	}

	public void FindDamageEffects(Virtue virtue, Virtue enemy){
		if(virtue.Affinities[Affinity].equals("Str")){
			System.out.println("Technical!");
		}
		else if(virtue.Affinities[Affinity].equals("Nul")){
			System.out.println("Technical!");
		}
		if(enemy.Affinities[Affinity].equals("Wk")){
			System.out.println("Weak to " + AffinityList[Affinity] + "!");
		}
		else if(enemy.Affinities[Affinity].equals("Str")){
			System.out.println("Resists " + AffinityList[Affinity] + "!");
		}
		else if(enemy.Affinities[Affinity].equals("Nul")){
			System.out.println("Nullifies " + AffinityList[Affinity] + "!");
		}
	}

}