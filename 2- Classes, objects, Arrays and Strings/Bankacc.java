//Java Program  to define  a  class  to  represent  a  bank  account
import java.io.*;

class Bank{
	 String name, type;
	 long acc_no= 1378234;
	 double bal;
 void getdata( String nm,  String ty,  double b)
  {
	name= nm;
	acc_no++;
	type= ty;
	bal=b;
   }

void  display( )
  {
	System.out.println(" Name:  "+name );
	System.out.println( " Account No:" + acc_no);
	System.out.println( " Account Type:  "+ type);
	System.out.println(" Balance Amount: " +bal);
  }

void withdraw(double amt)
{	System.out.println(" Withdrawl from  an account !" );
 	if ((bal-amt)<= 1000)
		System.out.println("Not enough balance!");
	else 
		bal= bal-amt;
}

void deposit(double amt)
{	System.out.println("Deposit to an account !" );
	System.out.println("Earlier balance : " +bal);
 	bal= bal+amt;
	System.out.println("Current balance: " +bal );
}
	
} //class Bank

class Bankacc {
public static void main(String arg[]) throws IOException
{
	String nm, ty;
	 double amt;
// using buffer reader  for accepting Input
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Enter Name: ");
  nm= br.readLine();
 System.out.print("Enter  Account Type:");
ty= br.readLine();
System.out.print("Enter Balance: ");
amt= Double.parseDouble(br.readLine());
      // Creating object of Bank Class

 Bank b1= new Bank();
 b1.getdata(nm, ty, amt);
b1.display();
System.out.print("Enter the Operation \n 1. Withdraw \n 2. Deposit \n");
int op= Integer.parseInt(br.readLine());
int wd, dp;
switch(op)
{
case 1:{
	System.out.print("Enter the amount to be Withdrawn from account:");
	wd= Integer.parseInt(br.readLine());
 	b1.withdraw(wd);
	b1.display();
        break;
	}

case 2: {
	System.out.print("Enter the amount to deposit in the account:");
	dp= Integer.parseInt(br.readLine());
 	b1.deposit(dp);
	b1.display();
        break;
	}
}
 
}//main

}//class Bankacc