
import java.io.*;
import java.util.Scanner;
public class InsertionSort
{	
	
	public static void sort(int arr[])
	{
		int n=arr.length;
		for(int j=1;j<n;j++)
		{
			int key=arr[j];
			int i=j-1;
			while((i>-1)&&(arr[i]>key))
			{
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
		}
		System.out.println("Sorted Array using insertin sort:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) 
	{	
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=s.nextInt();
		int[] a= new int[n];
		System.out.print("Enter the numbers:");
		for(int i=0; i<n;i++)
		{
			
			Scanner ss=new Scanner(System.in);
			
				try
				{
					a[i]=ss.nextInt();
				}
				catch(Exception e)
				{
					System.out.println("Enter a valid integer!");
					
				}
			
		}
		sort(a);
	}
}