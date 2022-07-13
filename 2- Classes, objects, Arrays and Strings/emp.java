
/*Write a program that would print the information
(name, year of joining, salary, address) of three
employees by creating a class for Employee by taking 
input from user using scanner class.*/



import java.util.*;
class employe
{
String name;
String date;
String address;
void assign(String n , String d , String a)
{
name=n;
date=d;
address=a;
}
void display()
{
System.out.println(name+" "+date+" "+address);
}}

public class emp
{
public static void main(String a[])
{

employe e[]=new employe[10];
Scanner sc=new Scanner(System.in);
for(int i=0;i<=2;i++)
{
e[i]=new employe();
System.out.println("Enter the employee name");
String nm=sc.next();
System.out.println("Enter the date of joining");
String da=sc.next();
System.out.println("Enter the employee address");
String ad=sc.next();
e[i].assign(nm,da,ad);
}
System.out.println("Name"+"  "+"Year of joining"+"  "+"address");
for(int i=0;i<=2;i++)
{
e[i].display();
}}}



