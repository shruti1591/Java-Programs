/*Write a Java program to demonstrate static variables*/

class Emp
{
public static double salary;
public static String name="ABC";
}

public class Variable3
{public static void main(String args[])
{
Emp.salary=60000;
System.out.println(Emp.name+" "+Emp.salary);
}}