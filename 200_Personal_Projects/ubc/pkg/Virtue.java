package pkg;
import java.util.*;

public class Virtue {
	public String Name;
	public Move[] Moves;
	public double Health;
	public double MaxHealth;
	//Strike Pierce Fire Ice Wind Elec Psy Light Dark
	String[] Affinities;
	public int status;
	String[] StatusList;
    int stack;

	public Virtue(String Name, Move[] Moves, double MaxHealth, String[] Affinities, String[] StatusList) {
		this.Name = Name;
	 	this.Moves = Moves;
		this.MaxHealth = MaxHealth;
		this.Health = MaxHealth;
        this.Affinities = Affinities;
		this.status = 0;
		this.StatusList = StatusList;
        this.stack = 0;
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
        if(move.BaseDamage > 0.0){
		    System.out.println(Name + " attacked " + enemy.Name + " with " + move.Name);
        }
        else{
            System.out.println(Name + " used " + move.Name + " on " + enemy.Name);
        }
		enemy.HitByMove(move,this);	
	}

	public void ChangeMove(Move newMove, int whichMove){
		System.out.println("Changed " + Name + "'s " + Moves[whichMove].Name + " to " + newMove.Name);
		Moves[whichMove] = newMove;
	}

	public void PrintHealth(){
		System.out.println( "Health: " + Health + "/" + MaxHealth);
	}

	public void PrintStatus(){
		System.out.println(Name + "'s Status: " + StatusList[status]);
	}

	public void HitByMove(Move move, Virtue virtue){
		if(Health == 0){
			System.out.println(Name + " is already dead!");
			System.out.println();
			return;
		}
		Health -= move.FindDamage(virtue,this);
        if(move.status != 0){
		status = move.status;
        stack = move.stack;
		PrintStatus();
        }
		if(Health <= 0){
			Health = 0;
		}
        if(move.BaseDamage > 0.0){
		    move.FindDamageEffects(virtue,this);
		    System.out.println(Name + " took " + move.FindDamage(virtue,this) + " Damage");
		    if(Health == 0){
		    	System.out.println(Name + " died!");
		    System.out.println();
            }
		}
	}
    public void EndTurnEffects(){
        if(status == 2){}
        else if(status == 3){}
        else if(status == 4){}   
        else if(status == 5){
            Health += MaxHealth/8;
            if(Health > MaxHealth){
                Health = MaxHealth;
            }
            System.out.println(Name + " gained " + MaxHealth/8 + " Health");
        }
        if(stack > 0){
            stack--;        
        }
        else{
            status = 0;
        }
    }
}