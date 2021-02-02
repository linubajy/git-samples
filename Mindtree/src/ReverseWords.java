
import java.lang.*;
import java.io.*;
import java.util.*;
public class ReverseWords
{	
	public static char[] rev(String name)
	{
		int flag=0;
		int l=name.length();
		char na[]=new char[l];
		for(int i=0;i<l;i++)
		{
			na[i]=name.charAt(i);
		}
		
		char c[]=new char[l];
		int i,j;
		
		//Validation
		for( i=0;i<l;i++)
		{
			if(na[i]=='.'||na[i]==' '|| na[i]==','||na[i]>='a'&&na[i]<='z'||na[i]>='A'&& na[i]<='Z'||na[i]>='0'&&na[i]<='9')
				continue;
			else 
				{
					System.out.println("Error in input!");
					System.exit(0);
				}
				
		}
		
		//Working
		
		for(i=0;i<l;i++)
		{
			
			 if(na[i]>='a'&&na[i]<'z'||na[i]>'A'&&na[i]<'Z')			//letters
			{
				
				int start=i;
				for(j=start+1;j<l;j++)
				{
					if((na[j]==' '||na[j]=='.'||na[j]==','||na[i]>='0'&&na[i]<='9'))
					{
						break;
					}
					else
						continue;
				}
				
				
				for(int k=j-1;k>=start;k--)
				{
						c[i]=na[k];
						i++;
						
					
				}
				i--;
				
			}
			 else if(na[i]>='0'&&na[i]<='9'||na[i]==','||na[i]==' '||na[i]=='.')
			{
				c[i]=na[i];
			}
			 
			
			
		}//end of for loop
		
		return c;
		
		
		
	}
	public static void main(String[] args) 
	{
		int flag=0;
		do
		{
			Scanner s=new Scanner(System.in);
			System.out.println(" Reversing word by word");
			System.out.print("NB:Include only letters,digits,',','.' or spaces)\n Enter a string :");
			String name=s.nextLine();
			int l=name.length();
			char A[]=new char[l];
			A=rev(name);
			System.out.println(A);
			flag=1;
		}while(flag!=1);
	
	}
}
