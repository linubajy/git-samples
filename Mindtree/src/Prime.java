import java.util.Scanner;

public class Prime {

	public static boolean isPrime(int a)	
	{
		int flag=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
				flag=1;
				break;
		}

		if(flag==1)
			//System.out.println("The number "+a+ " is composite.");
			return false;
		else
			//System.out.println("The number "+a+ " is prime.");
			return true;
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("PRIME NUMBER CHECKING");
		System.out.println("Enter a number:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a<=1)
			System.out.println(a+ " is neither prime nor composite.");
		else
			System.out.println("The value " +a+ " is "+ isPrime(a));
		
	}

}
