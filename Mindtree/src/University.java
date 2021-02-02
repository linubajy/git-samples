//Ex:1ds09cs010

import java.util.Scanner;

public class University {
	public static int university(String usn)
	{
		int flag=0;
		char[] a= new char[10];
		for(int i=0;i<10;i++) 
		{
			a[i]=usn.charAt(i);
		}
		if(a[0]=='1'||a[0]=='2') 
		{
			if((a[1]>='A'||a[1]<='Z')&&(a[2]>='a'||a[2]<='z'))
			{
				if((a[3]>='0'&&a[3]<='9')&&(a[4]>='0'&&a[4]<='9'))
				{
					if((a[5]=='C'&&a[6]=='S')||(a[5]=='I'&&a[6]=='S')||(a[5]=='E'&&a[6]=='C')||(a[5]=='M'&&a[6]=='E'))
					{
						if((a[7]>='0'&&a[7]<='9')&&(a[8]>='0'&&a[8]<='9')&&(a[9]>='0'&&a[9]<='9'))
						{
							flag=1;
						}
						else
						{
							System.out.println("Last 3 characters must be numbers!");
						}
					}
					else 
					{
						System.out.println("Enter a valid dept! ");
					}
				}
				else
				{
					System.out.println("The 3rd and 4th character must be a digit! ");
				}
			}
			else 
			{
				System.out.println("The 2nd character must be an uppercase letter!");
			}
		}
		else 
		{
			System.out.println("The first character must be 1 or 2. ");
		}
		if(flag==0) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	static String display()
	{
		Scanner obj =new Scanner(System.in);	
		System.out.println("Enter University Seat Number:");
		String usn=obj.next();
		return usn;
		
	}
	
	
public static void main(String[] args) {
	
	int m=-1;
	do 
	{
		String usn=display();
		if(usn.length()!=10) 
		{	
			System.out.println("Enter a 10 character university number!");
			System.out.println("********************************************");
			//usn=display();
			continue;
				
		}
		else 
		{
			m=university(usn);
			if (m==0)
			{
				System.out.println("Success!");
				System.out.println("********************************************");
			}
			else
			{
				System.out.println("Enter a valid university number.");
				System.out.println("********************************************");
			}
		
		}
	}while(m !=0);
	//obj.close();
}
}