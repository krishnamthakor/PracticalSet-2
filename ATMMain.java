
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.NullPointerException;

class ATMMain
{
	public static void main(String[] args)throws NullPointerException
	{
		int i;
		ArrayList<Acc> arrL=new ArrayList<Acc>();
		for(i=0;i<10;i++)
		{
			Acc ac=null;
			if(i<9)
				ac=new Acc("AC00"+(i+1));
			else
				ac=new Acc("AC0"+(i+1));
			arrL.add(ac);
		}
		Acc ac=null;
		Scanner sc=new Scanner(System.in);
		int temp;
		do
		{
			Acc.menu();
			System.out.print("\nEnter the choice : ");
			temp=sc.nextInt();

			if(temp==7)
				System.exit(0);
			if(temp==5)
			{
				System.out.print("\nEnter the Account id : ");
				String id=sc.next();
				ac=new Acc(id);
				arrL.add(ac);
				System.out.println("Your account has been successfully created.");
				continue;
			}
			if(temp==6)
			{
				System.out.print("\nEnter the Account id : ");
				String id=sc.next();
				for(i=0;i<arrL.size();i++)
				{	
					ac=arrL.get(i);
					if(id.equals(ac.getId()))
					{	
						arrL.remove(i);
						break;
					}
				}
				System.out.println("Your account has been successfully deleted.");
				continue;
			}
			do
			{	
				System.out.print("\nEnter the Account id : ");
				String id=sc.next();
				for(i=0;i<arrL.size();i++)
				{
					ac=arrL.get(i);
					if(id.equals(ac.getId()))	
						break;
				}	
				if(i==arrL.size())
					System.out.println("Enter valid id ");
				else	
					break;
			}while(true);

			switch(temp)
			{	
				case 1:
					ac.balanceInquiry();
					break;
				case 2:
					ac.withdrawMoney();
					break;
				case 3:
					ac.depositMoney();
					break;
				case 4:
					int j;
					System.out.print("Enter the Transfered Account id : ");
					String id1=sc.next();
					System.out.print("Enter the Transfered amount : ");	
					double db=sc.nextDouble();
					Acc ac1=null;
					for(j=0;j<10;j++)
					{
						ac1=arrL.get(j);
						if((ac1.getId()).equals(id1))
							break;
					}
					ac.moneyTransfer(ac1,db);
					break;
				default:
					System.out.println("Please Enter the valid choice.");
			}
		}while(true);
	}
}