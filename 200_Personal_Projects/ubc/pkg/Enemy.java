
package pkg;
import java.util.*;

public class Enemy{
	public Move[] Moves;
	public String Name;
	public double Health;
	public String[] Affinities;

	public Enemy(Move[] Moves,String Name, double Health,String[] Affinities){
		this.Moves = Moves;
		this.Name = Name;
		this.Health = Health;
		this.Affinities = Affinities;
	}

	public void HitByMove(Move move, Virtue virtue){
		if(Health == 0){
			System.out.println(Name + " is already dead");
			return;
		}
		Health -= move.FindDamage(virtue,this);
		if(Health <= 0){
			Health = 0;
		}
		System.out.println(Name + " was hit by " + move.Name + " and took " + move.FindDamage(virtue,this) + " Damage");
		if(Health == 0){
			System.out.println(Name + " died");
		}
	}

}