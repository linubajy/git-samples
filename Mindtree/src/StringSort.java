
//menu
import java.io.*;
import java.util.Scanner;
public class StringSort
{	public static void sort1(String arr[])
	{
		//bubblesort
		
		int l=arr.length;
		String temp;
		
		for(int i=0;i<arr.length;i++) //each word
		{
			for(int j=i+1;j<arr.length;j++) //next word
			{
				if(arr[j].compareTo(arr[i])<0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("Sorted strings using bubble sort :");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n\n**********************************************");
	}


	public static void sort2(String arr[])
	{	
		//insertion sort
		int n=arr.length;
		for(int j=1;j<n;j++)
		{
			String key=arr[j];
			int i=j-1;
			//String str1=arr[i];
			while((i>-1)&&(arr[i].compareTo(key)>0))
			{
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
		}
		System.out.println("\nSorted strings using insertion sort:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n\n*********************************************");
	}

	
	
	
	public static void main(String[] args) 
	{	
		
		//Accepting Array of strings
		
		int flag=0;
		do
		{
			Scanner s1=new Scanner(System.in);
			int ch=0;
			System.out.println("\nMENU \n1.BUBBLE SORTING \n2.INSERTION SORT \n3.EXIT \nEnter choice:");
			ch=s1.nextInt();
			if(ch==1||ch==2)
			{
				Scanner s=new Scanner(System.in);
				System.out.print("Enter the no of strings:");
				int n=s.nextInt();
				String[] a= new String[n];
				System.out.print("Enter strings to sort :");
				for(int i =0; i<n;i++)
				{
					Scanner ss=new Scanner(System.in);
					a[i]=ss.nextLine();	
				}
				
				
				if(ch==1)
				{
					sort1(a);
					flag=0;
				}
				else if(ch==2)
				{
					flag=0;
					sort2(a);
				}
			}
			else if(ch==3)
			{
				System.out.println("Exiting!");
				flag=1;
			}
			else 
			{
				System.out.println("Wrong choice!Try again");
				flag=0;
			
			}
			
			
		}while(flag!=1);
		
	}
}