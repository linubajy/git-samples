import java.util.Scanner;

public class ReverseNumber {
	
	public static int reversal(int a)
	{
		int n= a;
		int r=0;
		while(n>0)
		{
			int d= n%10;
		    r=r*10+d;
			n=n/10;
		}
		//System.out.println("Reversed numer:"+r);
		return r;

	}

	public static void main(String[] args) {
		int flag=0;
		do
		{
			System.out.println("Number Reversal.");
			System.out.println("Enter a number:");
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			if(a>0)
			{
				int r;
				r=reversal(a);
				System.out.println("Reversed number:"+r);
				System.out.println("*****************************************");
				flag=1;
			}
			else
			{
				System.out.println("Enter a valid number!\n\n ");
				System.out.println("*****************************************");
				flag=0;
			}
		}while(flag!=1);
	}

}
