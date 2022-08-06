import java.sql.Date;
import java.util.Scanner;

public class AccountMain1
{
    //ID - 21CE142
    //Name - Krishna M. Thakor
    //Aim - Develop a class Account with the properties and behaviours as mentioned

    public static void main(String args[])
    {
        int Id;
        double Balance;
        double AnnualInterestRate;
        Date DateCreated;
    
        Scanner sobj = new Scanner(System.in);
    
        System.out.print("Enter Account ID : ");
        Id = sobj.nextInt();
        
        System.out.print("Enter Balance: ");
        Balance=sobj.nextDouble();
        
        System.out.print("Enter Annual Interest Rate : ");
        AnnualInterestRate=sobj.nextDouble();
        
        System.out.print("Enter Date of Creation : ");
        DateCreated = sobj.date();
        
        Account aobj = new Account();
        
        aobj.setId(Id);
        aobj.setBalance(Balance);
        aobj.setAnnualInterestRate(AnnualInterestRate);
        aobj.setDateCreated(DateCreated);
        
        System.out.println("\nMonthly Interest : " + aobj.getMonthlyInterest());
            
        double Withdraw,Deposit;
        
        System.out.print("\nEnter Amount to be Withdrawn : ");
        Withdraw = sobj.nextDouble();
        aobj.Withdraw(Withdraw);
        
        System.out.print("\nEnter Amount to be Deposited : ");
        Deposit = sobj.nextDouble();
        aobj.Deposit(Deposit);
        
        sobj.close();

        System.out.println();
        System.out.println("ID : 21CE142\nName : Krishna M. Thakor");
    }
}

