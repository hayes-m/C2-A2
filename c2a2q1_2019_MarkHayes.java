package src;



import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * The program will accept six integer values within a range of 1 to 30,
 * store them to an array, and compute the sum and average of the values in the array.
 * 
 */

public class c2a2q1_2019_MarkHayes {

	/**
	 * @param letter - to catch InputMismatchException
	 * @param numbers - an array of all input digits
	 * @param number - each input one at a time
	 * @param sum - sum of all inputs
	 * @param average - average of inputs
	 * @param validator - ensures correct input
	 * 
	 * @author Mark Hayes
	 */
	public static void main(String[] args) {

		String letter = "";
		int[] numbers = new int[6];
		int number = 0;
		int sum = 0;
		boolean validator = false;		//declaring variables

		Scanner in = new Scanner(System.in);	//initialising the scanner method	

		System.out.println("Please enter six numbers between 1 and 30 (inclusive): ");	//prompting for user input
		for (int i = 0; i < numbers.length; i++)		//a loop to store the six inputs
		{
			validator = false;		//the 'validator' boolean variable ensures that the loop continues until six correct inputs are made
			while (!validator) {
				try {
					number = in.nextInt();	//stores the input to the 'number' variable

					if (!(number >= 1 && number <= 30))	//puts a range on what the user can input
					{
						System.out.println("Try numbers between 1 and 30");	//prompts for said range
					}
					else
					{
						validator = true;	//validates and continues the loop if inputs are correct
					}
				}
				catch (InputMismatchException e) {		//ensures only integers are entered
					System.out.println("Just integers please. ");
					letter = in.nextLine();
				}
			}
			numbers[i] = number;		//assigns the 'number' variables to each element of the 'numbers' array
		}

		in.close();	//closes the scanner

		System.out.println("Your input numbers are " + Arrays.toString(numbers));	//informs the user of their number choices

		for (int j : numbers)										//loops the array elements 
			sum += j;												//adds the elements together
		System.out.println("The sum of your numbers is " + sum);	//prints the sum

		float average = (float)sum/(float)numbers.length;						//calculates the average of the inputs and assigns it to a variable
		System.out.printf("The average of your numbers is %.2f", average);		//prints the average
	}

	
	
}




