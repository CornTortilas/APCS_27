/*
 *	Author:  
 *  Date: 
*/

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

class starter {
	static long startTime = 0;
	static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String args[]) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		populateArrayList();
		System.out.println("Choose a game mode 1-3!\n1. Get a random sentence out of 100\n2. Choose a sentence to type out\n3.QUIT");
		int choice = input.nextInt();input.nextLine();
		
		if(choice == 1){
			System.out.println("Alright!");
			String given = getSentence();
			System.out.println("Don't forget, only hit enter once you've finished the whole sentence");
			System.out.println("The time is: " + getTime());
			System.out.println("Your countdown is starting now!");
			countdown();
			System.out.println("Your sentence is: " + given);
			startTimer();
			String typed = input.nextLine();
			double elapsed = endTimer();
			int errors = compareSentences(given, typed);
			System.out.print("You had " + errors + " wrong");
			System.out.println(((errors==1) ? " letter":" letters"));
			int letterDiff = lettersInSentence(typed)-lettersInSentence(given);
			if(letterDiff != 0){
			System.out.print("You had " + Math.abs(letterDiff));
			System.out.print(((letterDiff>0) ? " more":" less"));
			System.out.print(((letterDiff==1) ? " letter":" letters"));
			System.out.println(" than the given sentence");
			}
			else{
				System.out.println("You had the right number of letters!");
			}

			int wordDiff = wordsInSentence(typed) - wordsInSentence(given);
			if(wordDiff != 0){
				System.out.print("You had " + Math.abs(wordDiff));
				System.out.print(((wordDiff>0) ? " more":" less"));
				System.out.print(((wordDiff==1) ? " word":" words"));
				System.out.println(" than the given sentence");
			}
			else{
				System.out.println("You had the right number of words!");
			}
			System.out.println("You took " + elapsed + " seconds and milliseconds");
			System.out.println("You had " + ((elapsed*60)/wordsInSentence(typed)) + " words per minute");
			System.out.println("You had " + ((elapsed*60)/lettersInSentence(typed)) + " letters per minute");


		}
		else if(choice == 2){
			System.out.println("Alright!");
			System.out.println("Which one?");
			String given = getSentence(input.nextInt());input.nextLine();
			System.out.println("Don't forget, only hit enter once you've finished the whole sentence");
			System.out.println("The time is: " + getTime());
			System.out.println("Your countdown is starting now!");
			countdown();
			System.out.println("Your sentence is: " + given);
			startTimer();
			String typed = input.nextLine();
			double elapsed = endTimer();
			int errors = compareSentences(given, typed);
			System.out.print("You had " + errors + " wrong");
			System.out.println(((errors==1) ? " letter":" letters"));
			int letterDiff = lettersInSentence(typed)-lettersInSentence(given);
			if(letterDiff != 0){
				System.out.print("You had " + Math.abs(letterDiff));
				System.out.print(((letterDiff>0) ? " more":" less"));
				System.out.print(((letterDiff==1) ? " letter":" letters"));
				System.out.println(" than the given sentence");
			}
			else{
				System.out.println("You had the right number of letters!");
			}

			int wordDiff = wordsInSentence(typed) - wordsInSentence(given);
			if(wordDiff != 0){
				System.out.print("You had " + Math.abs(wordDiff));
				System.out.print(((wordDiff>0) ? " more":" less"));
				System.out.print(((wordDiff==1) ? " word":" words"));
				System.out.println(" than the given sentence");
			}
			else{
				System.out.println("You had the right number of words!");
			}
			System.out.println("You took " + elapsed + " seconds and milliseconds");
			System.out.println("You had " + ((elapsed*60)/wordsInSentence(typed)) + " words per minute");
			System.out.println("You had " + ((elapsed*60)/lettersInSentence(typed)) + " letters per minute");

		}
		else{
			System.out.println("Looks like you wanted to quit. See ya!");
		}
		
	}

	// This method returns the local current time as a String
	public static String getTime(){
		LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return now.format(format);
	}

	// This method starts a clock that can be used throughout the program
	public static void startTimer(){
		startTime = System.nanoTime();
	}

	// This method stops the timer clock and returns a double of the seconds and milliseconds of the stopwatch
	public static double endTimer() throws InterruptedException{
		long endTime = System.nanoTime();
		long timeSeconds = ((endTime - startTime)/1000000);
		double decSeconds = timeSeconds/1000.0;
		return decSeconds;
	}

	// This method does a 3 second countdown and prints it to the terminal
	public static void countdown(){
		System.out.println("Starting countdown...");
		for (int i = 0; i < 3; i++) {
			System.out.println(3-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Go!");
	}

	// This method sets up a list of sentences to be called from. 
	// This should only be called once prior to getting sentences.
	private static void populateArrayList(){
		File f = new File("sentences.txt");
		try(Scanner fsc = new Scanner(f)){
			while(fsc.hasNextLine()){
				arr.add(fsc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.err.println("File not found: " + e.getMessage());
		}
	}

	// This chooses 1 of the 100 sentences in the list to return.
	public static String getSentence(){
		populateArrayList();
		int rand = (int)(Math.random()*100);
		return arr.get(rand);
	}

	// This returns the same sentence for the same integer given.
	public static String getSentence(int index){
		populateArrayList();
		return arr.get(index%100);
	}

	//  This returns the number of letters, spaces, and punctuations in a sentence.
	public static int lettersInSentence(String sent){
		return sent.length();
	}
	
	// This returns the number of words in a sentence
	public static int wordsInSentence(String sent){
		int spaceCount = 0;
		while(sent.indexOf(" ") > -1){
			spaceCount++;
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		return ++spaceCount;
	}

	// This method does a letter by letter comparison of each word and returns the number of errors.
	public static int compareSentences(String given, String typed){
		int errors = 0;
		while(given.length() > 0 && typed.length() > 0){
			if(!given.substring(0,1).equals(typed.substring(0,1)))
				errors++;
			given = given.substring(1);
			typed = typed.substring(1);
		}
		return errors;
	}

}
