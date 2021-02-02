
import java.io.*;

import java.util.Scanner;
public class NameExchange
{
	public static void exchange(String fname,String sname )
	{	
		int k1=0,k2=0;
		
		int m=fname.length();
		int n=sname.length();
		
		char f1[]= new char[m];
		char f2[]= new char[n];
		
		for(int i=0;i<m;i++)
		{
			f1[i]=fname.charAt(i);
		}
		
		for(int j=0;j<n;j++)
		{
			f2[j]=sname.charAt(j);
		}
		
		
		
		int count1=-1,count2=-1;
		
		
		
		
		char l1[]=new char[m-2-count1];
		char l2[]=new char[n-2-count2];
		
		for(int i=0;i<m;i++)		//index of f1
		{
			if(f1[i]==' ')
			{
				k1=i;
				count1++;
				break;
			}
			else
			{
				count1++;
				continue;
			}
		}
		
		
		for(int i=0;i<n;i++)		//index of f2
		{
			if(f2[i]==' ')
			{
				k2=i;
				count2++;
				break;
			}
			else
			{
				count2++;
				continue;
			}
		}
		
		System.out.println("\nNames after exchange:\n");
		System.out.println("First name:");
		
		//display f1
		for(int i=0;i<count1;i++)
		{
			System.out.print(f1[i]);
		}
		
		
		//display l2
		for(int j = k2;j<n;j++)		
		{
			
			l2[j-k2]=f2[j] ;
			System.out.print(l2[j-k2]);
			f2[j]='\0';	
		}
		System.out.println("\n");
		
		
		System.out.println("Second name:");
		
		//display f2
		for(int i=0;i<count2;i++)
		{
			System.out.print(f2[i]);
		}
		
		
		//display l1
		for(int j = k1;j<m;j++)		
		{
			
			l1[j-k1]=f1[j] ;
			System.out.print(l1[j-k1]);
			f1[j]='\0';	
		}
		
		System.out.println("\n***************************************");
	}

	public static void main(String[] args) 
	{	
		Scanner s =new Scanner(System.in);
		System.out.println("Name Exchange.");
		System.out.print("Enter 1st full name:");
		String fname=s.nextLine();
		System.out.print("Enter 2nd full name:");
		String sname=s.nextLine();
		exchange(fname,sname);
	}
}

