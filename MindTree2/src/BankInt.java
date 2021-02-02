
//30
import java.util.Scanner;

public class BankInt
{
	
	double balance;
	int InterestRate;
	int accountNo;
	
	BankInt()				//default constructor
	{
		balance=1000;
		InterestRate=10;
		accountNo=0100;
		
	}
	
	void SavingsAccount(){}
	
	void withDraw(int amount)
	{
		
		
		if(amount<balance)
			{
				balance=balance-amount;
				System.out.println("Successfully withdrawn.");
				System.out.println("Balance:"+balance);
				
			}
		else	
			System.out.println("Amount unavailable;");
	}
	
	void calculateInterest()
	{
		InterestRate=(int)((12*balance)/100);
		System.out.println("Interest for balance amount:"+InterestRate);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		BankInt se = new BankInt();
		System.out.println("Enter amount to withdraw:");
		int am= s.nextInt();
		
		se.withDraw(am);
		se.calculateInterest();
		se.SavingsAccount();
	}

}
