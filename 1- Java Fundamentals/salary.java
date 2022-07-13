

/*
Implement a java program to calculate gross salary &
net salary taking the following data.
Input: empno, empname, basic
Process:
DA=70% of basic
HRA=30% of basic
CCA=Rs240/-
PF=10% of basic
PT= Rs100/-
*/

import java.util.Scanner;
class salary
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of employee");
String name=sc.next();
System.out.println("Enter the id of employee");
String empid=sc.next();
System.out.println("Enter the basic salary of employee");
float basic=sc.nextFloat();
float da,hra,cca,pt,pf, gs=0.0f, ns=0.0f;

da=0.70f*basic;
hra=0.30f*basic;
cca=240.0f;
pt=100.0f;
pf=0.10f*basic;
gs=basic+da+hra+cca;
ns=gs-pt-pf;

System.out.println("Name of the employee is: "+name);
System.out.println("Employee ID of the enmployee is: "+empid);
System.out.println("Basic salary of the enmployee is: "+basic);
System.out.println("Gross salary of the enmployee is: "+gs);
System.out.println("Net salary of the enmployee is: "+ns);
}
}
