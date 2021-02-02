import java.util.Scanner;
//menu
public class BinarySearch {

	public static void binarySearchNum() 
	{   
		
		System.out.println("Enter the size of array:");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the array :");
		for(int i=0;i<size;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("Array in sorted order:");
		for(int i = 0; i < size; i++) {
	         for(int j=1; j < (size-i); j++) {
	            if(a[j-1] > a[j]) {
	              int  temp = a[j-1];
	               a[j-1] = a[j];
	               a[j] = temp;
	            }
	         }
	      }
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nEnter the item to search:");
		int x= s.nextInt();
		
		int flag=0;
		int l = 0, r = size - 1; 
		int m=0; 
		while (l <= r) 
		{ 
			m = l + (r - l) / 2;

			if(x == a[m]) 
				{
					
					flag=1;
					break;
				}
				
			else if(a[m]<x) 
				l = m + 1; 
			else if(a[m]>x)
				r = m - 1; 
		} 
		if(flag!=0)
			System.out.println("Element "+x+" found at position "+(m));
		else
			System.out.println("Element "+x+" not found ");
		

		
	} 
	
	public static void str()
	{
		System.out.println("Enter the number of strings:");
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		String a[]=new String[n];
		System.out.println("Enter the strings:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.next();
			
		}
		for(int i=0;i<a.length;i++) //each word
		{
			for(int j=i+1;j<a.length;j++) //next word
			{
				if(a[j].compareTo(a[i])<0)
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Sorted strings  :\n");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter the string to search:");
		String temp=s.next();
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(a[i].equalsIgnoreCase(temp))
			{
				//System.out.println("The word "+temp+" found ! ");
				continue;
			}
			else
			{
				flag=1;
				break;
			}	
		}
		if(flag!=0)
			System.out.println("The word "+temp+" found ! ");
		else
			System.out.println("The word "+temp+" not found.");
		
		
		
	}
	
	
	public static int display()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("MENU FOR BINARY SEARCH \n 1.Binary Search for Integers \n 2.Binary Search for Strings \n 3.Exit \n Enter choice:");
		int ch = s.nextInt();
		if(ch==1||ch==2||ch==3)
			return ch;
		else
			return 0;
	}

	public static void getAnswer(int ch)
	{
		if (ch==1)
		{
			binarySearchNum(); 	
		}
		else if(ch==2)
		{
			str();
		}
	
		else if(ch== 3)
		{
			System.out.println("Exiting!");
			System.exit(0);
		
		}
	}
	
	

	public static void main(String []args) 
	{ 
		int ch;
		// TODO Auto-generated method stub
		do
		{
			ch= display();
			//	System.out.println("ch:"+ch);
			if(ch==0)
			{
					System.out.println("\nWrong choice.\nEnter a valid choice. \n");
					System.out.println("*******************************************");
						continue;
						
			}
			if((ch!=0)&&(ch!=3))
			{	
				getAnswer(ch);
				System.out.println("*********************************************");
			}
			
			else if(ch==3)
			{
				System.out.println("Exiting!");
				System.out.println("********************************************");
				System.exit(0);
			}
				
			
			 
			
		} while(ch != 3);	
		
		
	}
		
		
		
	 
}
