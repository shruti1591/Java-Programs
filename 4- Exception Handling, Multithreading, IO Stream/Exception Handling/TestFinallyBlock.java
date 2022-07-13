/*Write a java program to demonstrate finally keyword in exception handling*/

class TestFinallyBlock{  
  public static void main(String args[]){  
  try{  
   int data=25/0;  
   System.out.println(data);  
  }  
  catch(NullPointerException e)
   {
   System.out.println("Hello");
  }  
  finally
{
System.out.println("finally block is always executed");
}  
  System.out.println("rest of the code...");  
  }  
}  