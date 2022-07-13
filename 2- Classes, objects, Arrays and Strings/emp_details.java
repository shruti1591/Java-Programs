
/*Write a java program that would print the information
(name, year of joining, salary, address) of three
employees by creating a class for Employee.*/

import java.util.*;
class employee
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

public class emp_details
{
public static void main(String a[])
{
employee st1=new employee();
System.out.println("Name"+"  "+"Year of joining"+"  "+"address");
st1.assign("Robert","1994","64C-wallstreet");
st1.display();
employee st2=new employee();
st2.assign("Sam","2000","68C-wallstreet");
st2.display();
employee st3=new employee();
st3.assign("John","1999","26B-wallstreet");
st3.display();
}}