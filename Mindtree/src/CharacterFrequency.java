import java.lang.*;
//inc
import java.io.*;
import java.util.*;
public class CharacterFrequency {
	public static void consecutive(String str)
		{	
			int j=1;		//each letter
			int index=0;	//start of each new char
			int k=1;		//each iteration
			int i=0;
			
			
			for ( i = index; i < str.length(); i++)
				{
					i=index;
					char c = str.charAt(i);
					int count=1;
					for( j=k;j<str.length();j++)
					{
						char d = str.charAt(j);
						
						 if(c == d)
						{
							count++;	
							k++;
							if((k==str.length())) 		//at the end of string 
							{
								
								
								System.out.print(c+""+count+"");
								System.exit(0);
							}
							
							
						}
						
						else if(c!= d && d!=' ')
						{ 
							k++;
							index=j;
							
							System.out.print(c+""+count+""); 	//usual count when adj elems are different
							count=0;
							
						
							if((k==str.length())) 				//last single character
							{
								count=1;
								char m=str.charAt(index);
								
								System.out.println(m+""+count+"");
								System.exit(0);
							}
							
							break;
							
						}
					}
				
		   
		}
		
		}
		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Compressing character frequency:");
			System.out.print("Enter a string: ");
			String str=s.nextLine();
			consecutive(str);
		}
	

}
