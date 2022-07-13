//Write a java program to demonstrate the constructor overloading
class ConsOverload
{
int id;
String name;
int age;
ConsOverload(int i, String n)
{
id=i;
name=n;
}
ConsOverload(int i, String n, int a)
{
id=i;
name=n;
age=a;
}
void display()
{
System.out.println(id+" "+name+" "+age);
}

public static void main(String arg[])
{
ConsOverload o1=new ConsOverload(1, "xyz");
ConsOverload o2=new ConsOverload(2,"abc",25);
o1.display();
o2.display();
}
}