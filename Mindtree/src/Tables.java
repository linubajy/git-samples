import java.util.Scanner;

public class Tables {
	
	public static void tables(int a)
	{
		if(a>0)
		{System.out.println("Tables of "+a+"\n");
		for(int i=1;i<=12;i++)
		{
			
			
			{
				int c=a*i;
				System.out.println(a+" X "+i+ " = "+c);
			}
		}
		}
		else
		{
			System.out.println("Multiplication not possible for numbers less than or equal to 0.");
		}
	}
	
	
	public static void main(String args[])
	{
		int flag;
		do
		{
			System.out.println("MULTIPICATION TABLE\n");
			System.out.print("Enter a number:");
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			if(a>0)
			{
				tables(a);
				flag=1;
			}
			else 
			{
				System.out.println("Enter a valid number.");
				System.out.println("*******************************************");
				flag=0;
				continue;
			}
			
		s.close();
		}while(flag!=1);
		
	}	

}
