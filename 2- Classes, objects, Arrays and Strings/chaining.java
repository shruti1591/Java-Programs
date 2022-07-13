
//Write a java program to demonstrate constructor chaining

class chaining
{
chaining()    //constructor 1
{
System.out.println("Default constructor");
}
chaining(int x)    //constructor 2
{
this();
System.out.println("One parameter constructor");
System.out.println(x);
}
chaining(int x, int y) //constructor 3
{
this(5);
System.out.println("Two parameters constructor");
System.out.println(x+" "+y);
}
public static void main(String ar[])
{
chaining o=new chaining(8,9);
}}

