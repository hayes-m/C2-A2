package src;

import java.util.Date;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
 * The program prompts for input of a three character string, converts each character to
 * its numerical equivalent, and then calculates the sum and prints to a text
 * file in CSV format with headings and a filename of today's date
 */

public class c2a2q2_2019_MarkHayes {

	/**
	 * @param letters - the input from the user
	 * @param sum - the result of the calculation
	 * @throws IOException where the filename is inaccessible for any reason
	 * 
	 * @author Mark Hayes
	 */
	public static void main(String[] args) throws IOException {

		
		String letters = "";		//declaring variables
		int sum;

		Date today = new Date();		//calling Date class for filename
		SimpleDateFormat todaysDate = new SimpleDateFormat("yyyyMMdd");		//formatting the date for the filename

		Scanner in = new Scanner(System.in);	//initialising the scanner method	

		System.out.print("Please enter a string consisting of ");	//prompting user input

		while ((letters.length() != 3) || (!letters.matches("[a-zA-Z]+")))	//ensures user enters exactly three alphabetical characters and loops until input is correct
		{
			System.out.println("three letters please: ");	//prompting user input - this string showed up with the above prompt which I couldn't figure out, so I appended it
			letters = in.next();		//grabs incorrect input
		}

		in.close();		//closes the scanner 

		letters = letters.toLowerCase();	//if the user inputs upper case letters, this method will convert them automatically

		System.out.println("Success! Check your file.");
		
		char one = letters.charAt(0);		
		char two = letters.charAt(1);
		char three = letters.charAt(2);		//splits the string input into individual char variables 

		int first = one - 'a' + 1;		
		int second = two - 'a' + 1;		
		int third = three - 'a' + 1;		//converts each character by subtracting the ASCII character value of 'a' (97) and adding one which gives a numerical representation of each letter

		sum = (first + second + third);		//adds these values and assigns the sum to a variable

		PrintWriter out = new PrintWriter(todaysDate.format(today) + ".txt");		//creates the text document in the project folder with today's date as the filename
		out.println("First | Second | Third | Sum |");		//prints the headings on the document

		out.printf("%5c | %6c | %5c | %3d |", one, two, three, sum);	//formats the values to be printed

		out.close();	//closes the document for writing
	}
}







