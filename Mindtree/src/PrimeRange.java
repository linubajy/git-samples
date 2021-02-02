import java.util.Scanner;

public class PrimeRange {

	public static void prime(int a,int b)
	{
		int count=0;
		if(a==1)
		{
			a++;
		}
		for(int i=a;i<=b;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
			
				if(i%j == 0)
				{	flag=1;
					break;
					
				}
						
			}
			if(flag != 1)
				{
					System.out.print(i+" , ");
					count++;
				}
		}
		
		System.out.println("count:"+count);
		if(count == 0)
			System.out.println("Empty List!");
		
		System.out.println("*****************************************");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		do
		{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the starting number(inclusive):");
		int a = s.nextInt();
		while(a<=0)
		{
			System.out.println("Enter a valid number greater than 0:");
			a=s.nextInt();
		}
		System.out.println("Enter the ending number(inclusive):");
		int b = s.nextInt();
		if(b>0)
		{
			prime(a,b);
			flag=1;
		}
		else
		{
			System.out.println("Not valid range!");
			System.out.println("*****************************************");
			flag=0;
		}
		
		}while(flag!=1);
	}

}
