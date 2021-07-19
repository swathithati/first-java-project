package miniproject;
import java.util.Scanner;
public class Banking {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	BankAccount obj=new BankAccount("swathi","NTY001");
	obj.showMenu();
	sc.close();
}
}
