import java.util.*;

public class Factorial {

	public static void factorial(long a)
	{
		long b=a;
		long f=1;
		if(a>0)
		{
			for(int i=(int)a;i>0;i--)
		
			{
				f=(f*i);
			}
			
			System.out.println("The factorial of "+b+ " is "+f);
		}
		else if(a<0)
		{
			System.out.println("Negative numbers do not have factorials!");
		}
		else
		{
			System.out.println("The factorial of 0 is 1.");
		}
		
	}
	static int display()
	{
		System.out.println("FACTORIAL \n");
		System.out.print("Enter a number:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a>=0)
			return a;
		else 
			return -1; 

	}
	
	public static void main(String args[])
	{
		
		
		int flag=0;
		do 
		{
			long a=display();
			
			if(a!=-1)
			{
				factorial(a);
				System.out.println("***************************************");
				flag=1;
			}
			else
			{
				System.out.println("Enter a valid number.\n");
				System.out.println("****************************************");
				
				flag=0;
				continue;
			}
			
		}while (flag!=1);
		
	}
}
