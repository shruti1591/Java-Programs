/*Write a java program to demonstrate method overloading (overload the method sum)*/

class sum
{
 int add(int x, int y)
{
return(x+y);
}
int add(int x, int y, int z)
{
return(x+y+z);
}
double add(double x, double y)
{
return(x+y);
}
public static void main(String args[])
{
sum s=new sum();
System.out.println(s.add(80,90));
System.out.println(s.add(86.5,89.6));
System.out.println(s.add(2,3,4));
}
}