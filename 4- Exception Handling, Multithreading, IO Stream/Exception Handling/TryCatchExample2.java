/*Write a java program to implement basic exception handling*/

public class TryCatchExample2 {  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/10; //may throw exception   
        System.out.println("We are Testing try block");
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println("This is our statement");  
        }  
        System.out.println("rest of the code");  
    }  
      
}  