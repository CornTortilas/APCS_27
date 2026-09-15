/* 
*	Author:   
* 	Date: 
*/
import java.util.Scanner;

class starter {
	public static void Pln(){
		System.out.println();
	}
	public static void main(String args[]) {

		Scanner Input = new Scanner(System.in);
		System.out.print("What's the name of your restaurant? ");
		String ResName = Input.nextLine();
		Pln();
		System.out.print("What's your name? ");
		String Name = Input.nextLine();
		Pln();
		System.out.println("Welcome to " + ResName + ", " + Name);
		System.out.println("Let's set up tonight's three item menu");
		Pln();
		String[] Items = new String[3];
		double[] ItemsPrice = new double[3];
		int[] ItemsCount = new int[3];
		for(int i = 0; i < 3; i++){
			System.out.print("What should Item #" + (i+1) + " be? ");
			Items[i] = Input.nextLine();
			System.out.print("What should it cost? ");
			ItemsPrice[i] = Input.nextDouble();
			Input.nextLine();
			System.out.print("How many will you order? ");
			ItemsCount[i] = Input.nextInt();
			Input.nextLine();
			Pln();
		}
		System.out.print("What percentage tip would you like to leave? ");
		double TipPercent = Input.nextDouble();
		TipPercent /= 100;
		Input.nextLine();
		double SubTotal = 0;
		for(int i = 0; i < 3; i++){
		SubTotal += ItemsPrice[i]*ItemsCount[i];
		}
		double Tax = 0.0975;
		double Total = SubTotal + SubTotal*Tax;
		double Tip = Total*TipPercent;
		Total += Tip;
		      System.out.println("Owner: " + Name);
      System.out.println("-------------------------------------------------");
      System.out.println("Item Qty Price");
      System.out.println("-------------------------------------------------");
	  for(int i = 0; i < 3;i++){
      System.out.println(Items[i] + " " + ItemsCount[i] + " " + ItemsPrice[i]);
	  }
      System.out.println("=================================================");
      System.out.println("Subtotal:                  " + SubTotal);
      System.out.println("Tax (9.75%):               " + Tax);
      System.out.println("Tip:                       " + TipPercent + "%");
      System.out.println("Tip Amount:                " + Tip);
      System.out.println("=================================================");
      System.out.println("TOTAL:                    $" + Total);
      System.out.println("=================================================");
      System.out.println();
      System.out.println("Thanks for eating at " + ResName + "!");
	}
}