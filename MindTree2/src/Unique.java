//pg 36
import java.util.Scanner;


public class Unique {
	
	static void Sort (int A[], int B[],int count1, int count2)
	{
		for(int i=0;i<count1;i++)
		{
			for(int j=i+1;j<count1;j++)
			{
				if(A[i]>A[j])
				{
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		for(int i=0;i<count2;i++)
		{
			for(int j=i+1;j<count2;j++)
			{
				if(B[i]>B[j])
				{
					int temp=B[i];
					B[i]=B[j];
					B[j]=temp;
				}
			}
		}

	}
	
	
	
	static void printUncommon(int A[], int B[],int count1, int count2) 
	{ 

		System.out.println("Unique Elements:");
		int i = 0, j = 0, k = 0; //i->A ,j->B
		while (i < count1 && j < count2) 
		{ 

			// If not common, print smaller 
			if (A[i] < B[j]&& A[i]!=0)
			{ 
				System.out.println(A[i]+" "); 
					i++; 
					k++; 
			} 
			else if (B[j] < A[i] && B[j]!=0) 
			{ 
				System.out.println(B[j]+" "); 
					k++; 
					j++; 
			} 

			// Skip common element 
			else
			{ 
				i++; 
				j++; 
			} 
		} 

		// printing remaining elements 
		while (i < count1) 
		{ 
			if(A[i]!=' ' && A[i]!=0)
				System.out.println(A[i]+" "); 
				i++; 
				k++; 
		} 
		while (j < count2)
		{ 
			if(B[j]!=' ' && B[j]!=0)
				System.out.println(B[j]+" "); 
					j++; 
					k++; 
		} 
	} 
	
	
	
	static void unique(int arr1[],int n1, int arr2[], int n2) 
	{
		int flag=0;
		int count1=0;
		int A[]=new int[n1];
		int B[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			for(int j=i+1;j<n1;j++)
			{ 
				flag=0;
				if(arr1[i]==arr1[j])
				{
					flag=1;
					arr1[j]='\0';
					break;
					
				}	
				
			}
			if(flag==0)
			{
				A[count1]=arr1[i];
				count1++;
				
			}
		}
		
		//unique elems in 2nd array	
		
		int count2=0;
		for(int i=0;i<n2;i++)
		{
			for(int j=i+1;j<n2;j++)
			{ 
				flag=0;
				if(arr2[i]==arr2[j])
				{
					flag=1;
					arr2[j]='\0';
					break;
					
				}	
				
			}
			if(flag==0)
			{
				B[count2]=arr2[i];
				count2++;
				
			}
		}
		
		
		Sort(A, B ,count1,count2);
		
		for(int i=0;i<count1;i++)
		{
			for(int j=i+1;j<count1;j++)
			{
				System.out.println(A[i]);
			}
		}
		printUncommon(A, B, count1, count2); 
		
	}
	
		

	public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the no of elements in first array:");
			int n1=s.nextInt();
			int arr1[]= new int[n1];
			System.out.println("Enter the elements :");
			for(int i=0;i<n1;i++)
			{
				arr1[i]=s.nextInt();
			}	
			
			System.out.println("Enter the no of elements in second array:");
			int n2=s.nextInt();
			int arr2[]= new int[n2];
			System.out.println("Enter the elements :");
			for(int i=0;i<n2;i++)
			{
				arr2[i]=s.nextInt();
			}
			
			unique(arr1,n1,arr2,n2);
			

			
		} 


	
	
}
