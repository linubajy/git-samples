import java.util.*;
public class ArraySum2 {

	
	public static int[]  sum(double a[],double b[],int m,int n)
	{
		int c[] = new int [10]; 
		int k=-1;
		int max;
		max=m>n?m:n;
		int i,j;
		for(i=0;i<max;i++)
		{
				if((i<max))
					{
						
						c[i]=(int)(a[i] + b[i]) ;
						k++;
						//System.out.println(c[i]);	
					}	
					
				
		}
		
		if(m>n)
		{
			for( i=k+1;k<=m+1;k++)
			{
			
				c[k]=(int)a[k];
			}
		}
		if(m<n)
		{
			for(i=k+1;k<=n+1;k++)
			{
						c[k]=(int)b[k];
			}
		}
		
		return c;
		
		
	}
	
	
	public static void main(String[] args) {
		double a[] = new double [10];
		double b[] = new double [10];
		
		Scanner s = new Scanner(System.in);
		
		//First Array
		System.out.println("Enter the size of first array:");
		int m = s.nextInt();
		System.out.println("Enter the elements :");
		for(int i=0;i<m;i++)
		{
			a[i]=s.nextDouble();
			
		}
		
		//Second Array
		System.out.println("Enter the size of second array:");
		int n = s.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			b[i]=s.nextDouble();
			
		}
		
		int max= (m>n)?m:n;
		int c[]=new int[max];
		c=sum(a,b,m,n);
		
		System.out.println("The array:");
		for(int i=0;i<max;i++)
		{
				System.out.println(" " + c[i]);	
					
		}

		
		
	}

}
