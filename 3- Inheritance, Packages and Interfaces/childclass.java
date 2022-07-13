
/*Write a basic java code to undersatand inheritance*/

class Parentclass
{
Parentclass()
{
System.out.println("constructor of parent class");
}

void disp()
{
System.out.println(" parent class method ");
}
}

class childclass extends Parentclass
{
childclass()
{
System.out.println("constructor of child class");
}

void disp()
{
System.out.println(" child class method ");
super.disp();
}

public static void main(String args[])
{
childclass c=new childclass();
c.disp();
}}
