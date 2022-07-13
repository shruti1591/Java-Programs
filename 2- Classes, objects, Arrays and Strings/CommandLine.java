//Write a java program to demonstrate command line arguments in java

class CommandLine
{
public static void main(String args[])
{
int r;
float pi=3.14f;
double ar, cir;

r=Integer.parseInt(args[0]);
ar=pi*r*r;
cir=2*pi*r;
System.out.println("Area is: "+ar);
System.out.println("Circumference is: "+cir);
}
}
