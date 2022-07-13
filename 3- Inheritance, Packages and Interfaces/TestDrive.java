/*Create an interface vehicle and classes like bicycle, car, bike etc, having common functionalities and put all the common functionalities in the interface. Classes like Bicycle, Bike, car etc implement all these functionalities in their own class in their own way*/

import java.util.Scanner;
interface Vehicle
{
void features(int a, int b);
}
class Bicycle implements Vehicle
{
int cc;
int capacit;
public void features(int c , int ca )
{
cc = c;
capacit = ca ;
}
void display()
{
System.out.println("the features of bicycle are:");
System.out.println(cc+" "+capacit);
}
}
class Bike implements Vehicle
{
int cc;
int capacit;
public void features(int c , int ca )
{
cc = c;
capacit = ca ;
}
void display()
{
System.out.println("the features of bike are:");
System.out.println(cc+" "+capacit);
}
}
class Car implements Vehicle
{
int cc;
int capacit;
public void features(int c , int ca )
{
cc = c;
capacit = ca ;
}
void display()
{
System.out.println("the features of car are:");
System.out.println(cc+" "+capacit);
}
}
class TestDrive
{
public static void main(String args[]){
System.out.println("Enter the vehicle code you want to see features of");
System.out.println("1:Bicycle");
System.out.println("2:Bike");
System.out.println("3:Car");
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
switch(s)
{
case 1:
Bicycle a=new Bicycle();
a.features(0,1);
a.display();
break;
case 2:
Bike b=new Bike();
b.features(100,2);
b.display();
break;
case 3:
Car c=new Car();
c.features(500,4);
c.display();
break;
}
}}