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
	private static boolean isActive = true;

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
	public void displayAccountInfo(){
		System.out.println("Name: " + Name);
		System.out.println("Id: " + Id);
		System.out.println("Balance: " + Balance);
		System.out.println("----------------");
	}
	
	public void checkBalance(){
		System.out.println("Balance: " + Balance);
		System.out.println("----------------");
	}

	public double getBalance(){
		return Balance;
	}

	public String getOwner(){
		return Name;
	}
	
	public void setOwner(String name){
		Name = name;
	}

	public void deposit(double amount){
		Balance += amount;
	}

	public void withdraw(double amount){
		if(Balance>=amount){
			Balance-=amount;
		}
		else{
			System.out.println("Balance too low");
		}
	}

	public void closeAccount(){
		isActive = false;
	}


}