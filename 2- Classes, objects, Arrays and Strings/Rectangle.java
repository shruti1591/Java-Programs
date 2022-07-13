// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Area
{
int length;
int breadth;
void setDim(int l,int b)
{
length=l;
breadth=b;
}
int getArea()
{
int area;
area=length*breadth;
return area;
}
}

class Rectangle
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
Area a1=new Area();
System.out.println("enter the length");
int l=sc.nextInt();
System.out.println("enter the breadth");
int b=sc.nextInt();
a1.setDim(l,b);
int x=a1.getArea();
System.out.println("Area of rectangle is");
System.out.println(x);
}
}