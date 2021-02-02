//IA-6
import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("DUPLICATE ELEMENTS LIST\n********************************");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of elements in Array:");
		int n=s.nextInt();
		int A[]= new int[n];
		int k;
		System.out.println("Enter the elements :");
		for(k=0;k<n;k++)
		{
			A[k]=s.nextInt();
		
		}	
		
		
		int C[]= new int[A.length+1];
		
		for(int i=0;i<=n-1;i++)
		{
			int c=A[i];
			int count=0;
			C[c]=count+1;	
			for(int j=i+1;j<n;j++)
			{
				
				if(A[i]==A[j])
				{	
					C[c]=C[c]+1;	
					A[j]='\0';
					
				}
				else
				{
					continue;
				}
				
				
			}
		}
		
		//System.out.println("max:"+max);
		
		System.out.println("Duplicate elements:");
		int flag=0;
		for(int i=0;i<A.length;i++)
		{
			
			if(C[i]>1)
			{
				System.out.println(i);
				flag=1;
			}
			else
				continue;
			
		}
		if(flag==0)
		{
			
			System.out.println("-1");
		}
		
		
		
		
		
	}

}
