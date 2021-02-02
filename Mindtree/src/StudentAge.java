
import java.util.*;
//inc
public class StudentAge 
{
	
	
	public static void age(String name,int a)
	{
		
		int len=name.length();
		int k=0;
		char[] ch=new char[len];
		
		for(int i=0;i<len;i++)
			ch[i]=name.charAt(i);//storing in array
		
		System.out.println("Password Generated :");
		System.out.print(ch[0]);
		int i=0;
		
		while(ch.length!='\0') 
			{
				
				if(ch[i]==' ')
				{
					System.out.print(ch[i+1]);	
					break;
				}
				if(ch[i]>=0 && ch[i]<=9)
				{
					System.out.print(ch[i]);
				}
				i++;
			}
		
		System.out.print(a);
		System.out.println("\n*****************************************");
		
			
	}
	
	
	public static void main(String[]args) 
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the full name :");
		String name=obj.nextLine();
		System.out.println("Enter the age: ");
		int age= obj.nextInt();
		int len=name.length();
		age(name,age);
		
		obj.close();
	}
}