//Write a java program to demonstrate the parameterized constructor
class Myclass
{
int num;
Myclass(int i)
{
num=i;

}}

class Cons1
{
public static void main(String args[])
{
Myclass m=new Myclass(100);
Myclass m1=new Myclass(200);
System.out.println(m.num);
System.out.println(m1.num);
}}