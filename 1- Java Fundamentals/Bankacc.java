
/*
Write a Menu driven program in java to implement
simple banking application. Application should read
the customer name, account number, initial balance,
rate of interest, contact number and address field etc.
Application should have following methods.
1. createAccount()
2. deposit()
3. withdraw()
4. computeInterest()
5. displayBalance()
*/


import java.util.*;
class Bank
{
String name;
long acc_no;
double bal;
float roi;
long contact;
String address;
void getdata(String n, long a,double b, long c, String add)
{
name=n;
acc_no=a;
bal=b;
contact=c;
address=add;
}
void display()
{
System.out.println("Name of the account holder is: "+name);
}
void deposit(double amt)
{
System.out.println("Deposit to an account");
System.out.println("Current balance of the account is: "+bal);
bal=bal+amt;
System.out.println("Updated balance of the account is: "+bal);
}

void withdraw(double amt)
{
System.out.println("Withdrawl from an account");
if(amt>bal)
{
System.out.println("Insufficient balance");
}
else
{
bal=bal-amt;
}
System.out.println("Updated balance of the account is: "+bal);
}
}

class Bankacc
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name: ");
String nm=sc.next();
System.out.println("Enter the account number: ");
long ac=sc.nextLong();
System.out.println("Enter the initial balance: ");
double ba=sc.nextDouble();
System.out.println("Enter the contact number: ");
long cn=sc.nextLong();
System.out.println("Enter the address: ");
String ad=sc.next();

Bank b1=new Bank();
b1.getdata(nm,ac,ba,cn,ad);

System.out.println("Enter the choice\n 1.Deposit \n 2.Withdraw \n 3.Display");
int op=sc.nextInt();
double dp,wd;
switch(op)
{
case 1:
{
System.out.println("Enter the amount to deposit");
dp=sc.nextDouble();
b1.deposit(dp);
break;
}
case 2:
{
System.out.println("Enter the amount to withdraw");
wd=sc.nextDouble();
b1.withdraw(wd);
break;
}
case 3:
{
b1.display();
}}}}

