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
	//int status;
	//double Accuracy

	public Move(double BaseDamage, String Name, int Affinity){
		this.BaseDamage = BaseDamage;
		this.Name = Name;
		this.Affinity = Affinity;
		//this.status = status;
		//this.Accuracy = Accuracy;
	}

	public double FindDamage(Virtue virtue, Enemy enemy){
		double Damage = BaseDamage;
		if(virtue.Affinities[Affinity].equals("Str")){
			Damage *= 1.2;
		}
		if(enemy.Affinities[Affinity].equals("Wk")){
			Damage *= 2;
		}
		else if(enemy.Affinities[Affinity].equals("Wk")){
			Damage /= 2;
		}
		return Damage;
	}

}