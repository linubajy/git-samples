
import java.lang.*;
//inc
import java.io.*;
import java.util.*;
public class ConsecutiveCharacter
{	
	public static void consecutive(String str)
	{
		char temp,temp1;
		int len=str.length();
		
		char st[] =new char[len];
		for(int i=0;i<str.length();i++)
		{
			st[i]=str.charAt(i);
		}
		
		
		int val=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(st[i+1]- st[i] == 1)
			{
				//System.out.println(st[i]);
				temp=st[i];
				temp1=st[i+1];
				val++;
				for(int j=i+1;j<str.length()-1;j++)
				{
					if((st[j]==temp)&&(st[j+1]-st[j] == 1)) //for similar set  
					{
						val++;
						st[j]='\0';
						st[j+1]='\0';
					}		
				}
				System.out.println(temp+" " +temp1+" "+":"+val);
			}
			val=0;
		}
	
	}
		
	
	public static void main(String[] args)  
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Displaying consective characters with frequency.");
		System.out.print("Enter a string: ");
		String str=s.nextLine();
		consecutive(str);
	}	
}


