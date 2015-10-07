// Fig. 3.1: Account.java
// Account class that contains an name instance variable 
// and methods to set and get its value.

public class Account
{
   /* FIELD(S)*/
   private String name; // PRIVATE instance variable

   /* CONTRUCTUCTOR(S)*/
   // no explicitly-defined constructor, so Java will
   // prepare a "default constructor" for ys. This default
   //constructor has no arguments (no parameters).
   /*
   * METHODS(S)
   * Note: When you define a field (an instance variable)
   * it is often a good idea to "encapsulate" each field
   * by defining public set and get metods, like those below:
   */

   // PUBLIC method to set the name in the object              
   public void setName(String name)      
   { 
      /* 
      Note that there are two variables with the same name!
      Which one is a local variable, having method-wide scope?
      Which one is the instance variable, having class-wdie scope?
      Where was the local variable actually declared?
      */                                            
      this.name = name; // store the name
   } // end method setName      

   // PUBLIC method to retrieve the name from the object
   public String getName()        
   {          
      //returning the value of the INSTANCE VARIABLE name 
      // (note that no local variable was declared inside this method) 
      // Also note that whatever is returned has to match the 
      // return type for the method (in this case, String)                         
      return name; // return value of name to caller        
   } // end method getName       
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
