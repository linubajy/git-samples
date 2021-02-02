import java.util.Scanner;

//IA-5

public class Pallindrome {
	
	public static void number()
	{
		System.out.println("Enter the number:");
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		int a=num;
		int r=0;
		
		while(num>0)
		{
			int d=num%10;
			r=r*10+d;
			num=num/10;
		}
		if(r==a)
			System.out.println("The number is pallindrome!");
		else
			System.out.println("The number is not a pallindome!");
		
		System.out.println("*************************************\n\n");

	}
	
	public static void string()
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=s.nextLine();
		int l=str.length();
		char st[]=new char[l];
		
		for(int i=0;i<l;i++)
		{
			st[i]=str.charAt(i);
		}
		
		
		int i,j;
		int flag=0;
		for(i=0,j=l-1;i<l/2;i++,j--)
		{
			if (st[i]!=st[j])
			{	
				flag=1;
				break;
			}
			
		}
		if(flag!=1)
			System.out.println("The string is a pallindrome! ");
		else
			System.out.println("The string is not a pallindrome! ");
		
		System.out.println("*************************************\n\n");
		
	}
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int ch=0;
		do 
		{
			
		System.out.println("PALLINDROME\n******************************* ");
		System.out.println("1.PALLINDROE FOR NUMBER\n2.PALLINDROME FOR STRING\n3.EXIT\nEnter choice:");
		Scanner s= new Scanner(System.in);
		ch=s.nextInt();
		
		if(ch==1)
			number();
		
		else if(ch==2)
			string();
		
		else if(ch==3)
		{	System.out.println("Exiting!!");
			System.exit(0);
		}
		
		else
		{
			System.out.println("Wrong choice!");
			continue;
		}
		
		}while(ch!=3);
		
	}

}
