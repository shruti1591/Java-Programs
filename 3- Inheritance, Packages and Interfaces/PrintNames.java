/*Create a user defined package myPackage contains class MyClass.Import the same to PrintNames class in java.
*/

import myPackage.MyClass;

public class PrintNames
{
   public static void main(String args[]) 
   {       
      // Initializing the String variable 
      // with a value 
      String name = "Hello";
      
      // Creating an instance of class MyClass in 
      // the package.
      MyClass obj = new MyClass();
      
      obj.getNames(name);
   }
}