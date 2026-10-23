/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private int Id;
	public String Name;
	private double Balance;
	private static int nextId = (int)(Math.random()*951+50);

	// -------CONSTRUCTORS-------
	public BankAccount(String name, double balance){
		Id = nextId;
		Name = name;
		Balance = balance;
		nextId++;
	}	
	
	public BankAccount(String name){
		Id = nextId;
		Name = name;
		Balance = 0;
		nextId++;
	}

	public BankAccount(){
		Id = nextId;
		Name = "";
		Balance = 0;
		nextId++;
	}

	// -------METHODS-------
	public void info(){
		System.out.println("Name: " + Name);
		System.out.println("Id: " + Id);
		System.out.println("Balance: " + Balance);
		System.out.println("----------------");
	}
	
	public void checkBalance(){
		System.out.println("Balance: " + Balance);
		System.out.println("----------------");
	}

}