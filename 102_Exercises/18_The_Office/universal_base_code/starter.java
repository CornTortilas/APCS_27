/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		Employee dwight = new Employee(1987,"Dwight","Schrute",4416.16);
		Employee jim = new Employee(2474,"Jim","Halpert",4416.16);
		Employee pam = new Employee(2011,"Pam","Beesly",2250);
		Employee aj = new Employee(8888,"AJ","Conroy",4383);
		michael.raiseSalary(2);
		dwight.raiseSalary(3);
		jim.raiseSalary(3);
		pam.raiseSalary(20);
		aj.raiseSalary(-200);	
		michael.employeeToString();
		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		aj.employeeToString();
		System.out.println("Yearly Salaries:");
		System.out.println(michael.getFirstName() + " " + michael.getLastName() + ": " + michael.getAnnualSalary());
		System.out.println(dwight.getFirstName() + " " + dwight.getLastName() + ": " + dwight.getAnnualSalary());
		System.out.println(jim.getFirstName() + " " + jim.getLastName() + ": " + jim.getAnnualSalary());
		System.out.println(pam.getFirstName() + " " + pam.getLastName() + ": " + pam.getAnnualSalary());
		System.out.println(aj.getFirstName() + " " + aj.getLastName() + ": " + aj.getAnnualSalary());
	}
}
