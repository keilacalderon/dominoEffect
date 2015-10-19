// Fig. 3.8: Account.java
// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation.

public class Account
{  
   /*
   * FIELD(S)
   */ 
   private String name; // instance variable 
   private double balance; // instance variable -- double precision floating point
                           // the default value of a double instance variable is 0.0

   /*
   * CONSTRUCTOR(S)
   */
   // Account constructor that receives two parameters  
   // (We might also call this a "two arugment constructor or "2-arg constructor")
   public Account(String name, double balance) 
   {
      // remeber that the contrsuctor is used to create
      // and initialize an instance of the Account class (a.k.a, an Account object)
      this.name = name; // assign name to instance variable name

      // validate that the balance is greater than 0.0; if it's not,
      // instance variable balance keeps its default initial value of 0.0
      if (balance > 0.0) // if the balance is valid
      {
         this.balance = balance; // assign it to instance variable balance
      } // end if

   } // end Account constructor

   /* Special note: because we defined an explicit constructor above, 
   we "lose" the default zero-arg constructor that would otherwise 
   have been created for us! (This means that, unless we explicitly
   define a zero-arg constructo, then we can't insantiate an Account
   object with no arguments) */

   // method that deposits (adds) only a valid amount to the balance
   public void deposit(double depositAmount) 
   {      
      if (depositAmount > 0.0) // if the depositAmount is valid
         balance = balance + depositAmount; // add it to the balance 
   }

   // method returns the account balance
   // this is a get method, so it's an "accessor" method
   public double getBalance()
   {
      return balance; // whatever we return in our return statement must
                     // be compatible with the return type for the method
   } // end method getBalance 

   // method that sets the name
   public void setName(String name)
   {
      this.name = name; 
   } 

   // method that returns the name
   public String getName()
   {
      return name; 
   } 
} // end class Account

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
