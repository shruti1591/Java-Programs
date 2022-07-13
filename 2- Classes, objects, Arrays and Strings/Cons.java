//Java progrm to demonstrate no parameter constructor.

class Myclass
{
int num;
Myclass()
{
num=100;
}}

class Cons
{
public static void main(String args[])
{
Myclass m=new Myclass();
System.out.println(m.num);
}}