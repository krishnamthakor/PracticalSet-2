/*
* ID :21CE142
* Name : Krishna M. Thakor
* AIM: Use the Account class created as above to simulate an ATM
machine.
* Create 10 accounts with id AC001.....AC010 with initial
balance 300₹.
* The system prompts the users to enter an id. If the id is
entered incorrectly, ask the user to enter a correct id.
* Once an id is accepted, display menu with multiple
choices.
* 1.Balance inquiry
* 2.Withdraw money [Maintain minimum balance 300₹]
* 3.Deposit money
* 4.Money Transfer
* 5.Create Account
* 6.Deactivate Account
* 7.Exit
*/
import java.util.Scanner;

class Acc
{
	private Scanner sc=new Scanner(System.in);
	private String id="";
	private double balance=300;

	public Acc(String id)
	{
		this.id=id;
	}
	public Acc(String id,double balance)
	{ 
		this.id=id;
		this.balance=balance;
	}	
	public Acc()
	{	
		System.out.print("\nEnter the Account id : ");
		id=sc.next();
		System.out.print("\nEnter the initial amount : ");
		balance=sc.nextDouble();
	}
	public void balanceInquiry()
	{
		System.out.println("Your Bank balance is : "+balance);
	}	
	public void withdrawMoney()
	{	
		int flag=0;
		do	
		{
			System.out.print("\nEnter the withdral amount : ");
			double temp=sc.nextDouble();
			if(temp<0)
				System.out.println("Please enter the valid withdraw amount.");

			else if(balance-temp>=300)
			{ 
				balance-=temp;
				break; 
			}
			else
				System.out.println("you are not able to withdraw money.");
		
		}while(true);
		
		System.out.println("Your available balance is : "+balance);
	}
	
	public void depositMoney()
	{
		do	
		{
			System.out.print("\nEnter the deposit amount : ");

			double temp=sc.nextDouble();
			if(temp<0)
				System.out.println("Please enter the valid deposit amount.");
			else
			{ 
				balance+=temp;
				break;
			}
		}while(true);

		System.out.println("Your available balance is : "+balance);
	}
	
	public void moneyTransfer(Acc ac1,double bal)
	{
		if(this.balance-bal>=300)	
		{	
			this.balance-=bal;
			ac1.setBalance(ac1.getBalance()+bal);
			System.out.println("Money Transfer is successfully completed.");
		}
		else
			System.out.println("Money Transfer is not successfully completed.");
	}
	
	public void createAccount(Account ac)
	{ 
		ac=new Account();
		System.out.println("Your Account has been successfully created.");
	}
	
	public static void menu()
	{
		System.out.println("\n 1. Balance inquiry \n 2. Withdraw money \n 3. Deposit money\n 4. Money Transfer\n 5. Create Account\n 6. Deactivate Account\n 7. Exit");
	}
	
	public void setBalance(double balance)
	{	
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getId()
	{
		return id;
	}
}