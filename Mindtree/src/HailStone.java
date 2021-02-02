import java.util.Scanner;

public class HailStone {

	public static int hailstone(int a)
	{
		int b;
		int count=0;
		int result=a;
		while (result!= 1)
		{
			if(result%2==0)
			{	
				b=result;
				result/=2;
				System.out.println(b+" is even so I take half:"+result);
				count++;
			}
			else if(result%2 != 0)
			{
				b=result;
				result=3*result+1;
				System.out.println(b+" is odd so I take 3n+1:"+result);
				count++;
			}
		}
		return count;

	}
	
	public static int display()
	{
		System.out.println("HAILSTONE\n");
		System.out.print("Enter a number:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a>0)
			return a;
		else 
			return 0; 

	}
	
	
	public static void main(String[] args) {
		
		
		int count;
		
		int flag=0;
		do 
		{
			int a=display();
			
			if(a>0)
			{
				count=hailstone(a);
				System.out.println("No of steps:"+count);
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
