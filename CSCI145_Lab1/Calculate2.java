// CSCI 145 Lab 1, problem 1: Calculate2.java
// Performing calculations
import java.util.Scanner;

/*
Sample output (should not only 
compute the right results, but also
be formatted properly as well!)
------------------------------------

Enter first integer: 10 
Enter second integer: 20 
Enter third integer: 30
For the numbers 10, 20 and 30 
Largest is 30
Smallest is 10
Sum is 60
Product is 6000
Average is 20

*/

// Step 1: write an appropriately descriptive Javadoc comment for the class
/**
* This application reads in three integers, then determines 
* the largest and smallest of the three, and then 
* computes the sum, product, and average of the three values.
* The results of the program are then printed to
* standard output using formatted strings.
*
*@author keila@email.uscb.edu
*@version 2015.10.12
*/
public class Calculate2
{
	public static void main( String[] args ) 
	{
		Scanner input = new Scanner( System.in );

		int number1; // first number
		int number2; // second number
		int number3; // third number
		int largest; // largest value
		int smallest; // smallest value
		int sum; // sum of numbers
		int product; // product of numbers
		int average; // average of numbers

		/* Step 2: write a series of statements to read in three numbers and 
		assign them to number1, number2, and number3 */
		System.out.print( "Please enter first integer: " ); // prompt for input
      	number1 = input.nextInt(); // read first number
      	System.out.print( "Please enter second integer: " ); // prompt for input
      	number2 = input.nextInt(); // read second number
      	System.out.print( "Please enter third integer: " ); // prompt for input
      	number3 = input.nextInt(); // read third number

        /* Step 3: write code here that compares all three integers and 
		   sets the largest and smallest accordingly */	
		largest = number1; // assume (for now) that number1 is the largest

		// 3a) write your code to determine the largest value here
		if ( number2 > largest ) // determine whether number2 is larger
	    {
	       	largest = number2;
	    } // end if

      	if ( number3 > largest ) // determine whether number3 is larger
      	{
        	largest =number3;
      	} // end if


		smallest = number1; // assume (for now) number1 is the smallest

		// 3b) write your code to determine the smallest value here		
		if ( number2 < smallest ) // determine whether number2 is smallest
      	{
           smallest = number2;
      	} // end if
      
      	if ( number3 < smallest ) // determine whether number3 is smallest
      	{
           smallest = number3;
      	} // end if

		// perform calculations -- the sum is done for you
		sum = number1 + number2 + number3;

		/* Step 4: write statements to calculate the product and the average */
		product = number1 * number2 * number3;
		average = sum / 3;

		/* Step 5: write statements that display the results 
		 * (Remember to check your results against the sample output above!)
		 */
		System.out.printf( "\nFor the numbers %d, %d and %d\n", number1, number2, number3 );
	    System.out.printf( "Largest is %d\n", largest );
	    System.out.printf( "Smallest is %d\n", smallest );
	    System.out.printf( "Sum is %d\n", sum );
	    System.out.printf( "Product is %d\n", product );
	    System.out.printf( "Average is %d\n", average );

	} // end method main

} // end class Calculate2