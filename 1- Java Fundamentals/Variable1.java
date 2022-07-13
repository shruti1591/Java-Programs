/*Write a Java program to demonstrate local variables*/

public class Variable1
{
public void StudentAge()
{
int age=0; //Local variables
age=age+5;
System.out.println("age of the student is:"+age);
}
public static void main(String args[])
{
Variable1 var=new Variable1();
var.StudentAge();
}}