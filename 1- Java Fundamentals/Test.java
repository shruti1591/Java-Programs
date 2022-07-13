/*Write a basic java code of class creation.*/

class Student
{
String name;
int rollno;
static String collegename="VIT";

void assign(int r, String n)
{
rollno=r;
name=n;
}

void display()
{
System.out.println(rollno+" "+name+" "+collegename);
}
}

class Test
{
public static void main(String a[])
{
Student st1=new Student();
st1.assign(10,"Dessy");
st1.display();

Student st2=new Student();
st2.assign(11,"Ketan");
st2.display();


}}




