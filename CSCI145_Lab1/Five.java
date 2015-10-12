// CSCI 145 Lab 1, problem 3: Five.java
// Separating the digits in a five-digit number using the division 
// and modulus operators, / and %
import java.util.Scanner;

// Step 1: Write an appropriately descriptive Javadoc comment for this class
/**
 * This program separates the digits in a five-digit number using the divison
 * and modulus operators, / and % 
 *
 * @author keila@email.uscb.edu
 * @version 2015-10-12
 *
 */
public class Five 
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      int number; // number input by user
      int digit1; // first digit
      int digit2; // second digit
      int digit3; // third digit
      int digit4; // fourth digit
      int digit5; // fifth digit

      System.out.print( "Enter five digit integer: " ); // prompt
      number = input.nextInt(); // read number 

      // determine the 5 digits (digits 1 and 5 are done for you)
      // remember your order of operations (PEMDAS)
      // and work everything out one step at a time.

      // Remember: you are permitted to use only the / and % operators

      // Think of the integer division operator ( / ) as the 
      // "gozinta" operator, because it tells you how many times
      // the divisor "gozinta" the numerator (the dividend)
      
      digit1 = number / 10000;   // Ex: 54321 / 10000 is 5

      /* Steps 2-4: write code here that will separate the remainder of the 
         digits in the variable "number" and assign each one to the 
         corresponding integer variable */

      digit2 = (number % 10000) / 1000; // Hint: we want to extract the LAST 4 digits
                            // of number, then extract the FIRST digit
                            // of the resulting 4-digit value

      digit3 = (number % 1000) / 100; // Hint: we want to extract the LAST 3 digits
                            // of number, then extract the FIRST digit
                            // of the resulting 3-digit value

      digit4 = (number % 100) / 10; // Hint: we want to extract the LAST 2 digits
                            // of number, then extract the FIRST digit
                            // of the resulting 2-digit value

      digit5 = number % 10; // Example: 54321 % 10 results in the value 1

      /* Step 5: write a statement that displays each digit separated by 
         three spaces. */
      System.out.printf( "Digits in %d are %d   %d   %d   %d   %d \n", 
         number, digit1, digit2, digit3, digit4, digit5);

   } // end method main

} // end class Five

