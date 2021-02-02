
import java.lang.*;


import java.io.*;
import java.util.Scanner;
public class Initials
{	
	
	
	
	
	public static void initial(String n)
	{	
		int flag=0;
		System.out.print("Initials : ");
		int len=n.length();
		char name[]=new char[len];
		for(int i=0;i<n.length();i++)
		{
			name[i]=n.charAt(i);
		}
		
		for(int i=0;i<name.length;i++)
		{
			
			
			if(i==0)
			{
				System.out.print(name[0]);
			}
			else if(name[i] == ' ' )
			{
				System.out.print(name[i+1]);
				flag=1;
			}
			
		}
		if(flag == 0)
			System.out.println(" not valid");
		
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter name to compute initials: ");
		String name=s.nextLine();
		String n=name.toUpperCase();
		initial(n);
	}
}