/*Create a Teacher class and derive Professor/
Associate_Professor/Assistant_Professor class from
Teacher class. Define appropriate constructor for all the
classes. Also define a method to display information of
Teacher. Make necessary assumptions as required. */

class Teacher
{
String name;
int exp;
Teacher()
{
name="Sujata";
exp=30;
}
void disp()
{
System.out.println(name+" "+exp+"years");
}}
class Ass_Proffesor extends Teacher
{
String tname;
int texp;
int phd_students_guided;
Ass_Proffesor(String n, int e , int p)
{
tname=n;
texp=e;
phd_students_guided=p;
}
void disp()
{
System.out.println(tname+" "+texp+"years " +phd_students_guided+"phd students guided");
super.disp();
}
public static void main(String args[])
{
Ass_Proffesor c=new Ass_Proffesor("Rahul" , 20 , 50);
c.disp();
}}