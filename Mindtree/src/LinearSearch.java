import java.io.*;
import java.util.Scanner;

public class LinearSearch {

	public static boolean sort(int arr[],int item)
	{
		int l=arr.length;
		
		for(int i=0;i<l;i++)
		{
			if(arr[i]==item)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int flag=0;
		
		do
		{
			
		Scanner s=new Scanner(System.in);
		System.out.println("LINEAR SEARCH");
		System.out.print("Enter the size of array:");
		int n=s.nextInt();
		if(n!=0)
		{	
			int a[]= new int[n];
			System.out.print("Enter elements of the integer array:");
			for(int i =0; i<n;i++)
			{		
				a[i]=s.nextInt();
				
			}
			System.out.print("Enter the num to be searched for:");
			int item=s.nextInt();
			boolean bs=sort(a,item);
			System.out.print(bs);
			flag=1;
		}
		else
		{
			System.out.println("\nEnter a valid array size.");
			flag=0;
		}
		}while(flag!=1);	
	}
	

}



	