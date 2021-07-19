package miniproject;

import java.util.Scanner;

public class BankAccount {
int balance;
int previousTransaction;
String customerName;
String customerId;
BankAccount(String cname,String cid)
{
	customerName=cname;
	customerId=cid;
}


public void deposit(int amount)
{
	if(amount !=0)
	{
		balance=balance+amount;
		previousTransaction=amount;
	}
}
public void withdraw(int amount)
{
	if(amount !=0)
	{
		balance=balance-amount;
		previousTransaction=-amount;
	}
	}

public void getPreviousTransaction()
{
	if(previousTransaction > 0)
	{
		System.out.println("Deposited:"+previousTransaction);
}
else if(previousTransaction<0)
{
		System.out.println("withdrawn:"+Math.abs(previousTransaction));
}
else
{
	System.out.println("no transaction occured");
}
}
public void showMenu()
{
	char option='\0';
    Scanner sc=new Scanner(System.in);
	System.out.println("wecome"+customerName);
    System.out.println("your id"+customerId);
	System.out.println("\n");
	System.out.println("A.check Balance");
    System.out.println("B.Deposite");
	System.out.println("C.withdrawn");
	System.out.println("D.previous transaction");
	System.out.println("E.Exit ");
	do
	{
		System.out.println(".................");
		System.out.println("enter an option");
		System.out.println(".................");
		option=sc.next().charAt(0);
		System.out.println("\n");
		switch(option)
		{
		case 'A':
			System.out.println(".................");
			System.out.println("Balance="+balance);
		System.out.println(".................");
		System.out.println("\n");
			break;
		case 'B':
			System.out.println(".................");
			System.out.println("Enter an amount to deposit:");
			int amount=sc.nextInt();
			deposit(amount);
			System.out.println("\n");
		break;
		case 'C':
			System.out.println("......................................");
			System.out.println("Enter an amount to withdraw:");
			System.out.println(".................................");
			int amount1=sc.nextInt();
			withdraw(amount1);
			System.out.println("\n");
			break;
		case 'D':
			System.out.println("................................");
			getPreviousTransaction();
			System.out.println("\n");
		break;
		case 'E':			
			System.out.println("*************************************");
			break;
		default:
			System.out.println("Invalid option!please enter again");
			break;
		}
	}
	while(option !='E');
	System.out.println("Thank you for using our banking sevices");
	sc.close();
}
}

	
	