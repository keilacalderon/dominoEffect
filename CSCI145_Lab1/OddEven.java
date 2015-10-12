// CSCI 145 Lab 1, problem 2: OddEven.java
// Program that determines if a number is odd or even.
import java.util.Scanner;

// Step 1: Write an appropriately descriptive Javadoc comment for the class
/**
 * Program that determines if an entered integer is odd or even
 *
 *
 * @author keila@email.uscb.edu
 * @version 2015-10-12
 *
 */
public class OddEven 
{
   public static void main( String[] args )
   {
      // instantiate a Scanner object to read in keyboard input from user
      Scanner input = new Scanner( System.in );

      int number; // number to be tested as either odd or even

      System.out.print( "Enter integer: " ); // prompt for input
      number = input.nextInt(); // read in an integer, using the nextInt() 
                                // method of the Scanner class


      // Step 2: if number is even, print the message "Number is even" 
      //         to standard output

      if ( number % 2 ==0  )  // Hint: what is the rule for determining whether a number is even?
      {
         System.out.println( "Number is even" );
      } // end if

      // Step 3: if number is odd, print the message "Number is odd"
      //         to standard output

      if ( number % 2 !=0  )  // Hint: what is the rule for determining whether a number is odd?
      {
         System.out.println( "Number is odd" );
      } // end if

   } // end method main

} // end class OddEven