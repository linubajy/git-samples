import java.util.Scanner;

//pg 39
public class RowMagic {
	
	
	public static boolean isRowMagic(int A[][],int m,int n)
	{
				//Computing sum of each row
				int Row[]=new int[m];
				for(int i=0;i<m;i++)
				{
					int sum=0;
					for(int j=0;j<n;j++)
					{
						sum=sum+A[i][j];
					}
					Row[i]=sum;
					
					
				}
				
				//Iterating through the array
				int flag=0;
				for(int i=0;i<m;i++)
				{
					for(int j=i+1;j<m;j++)
					{
						if(Row[i]!=Row[j])
						{	
							flag=1;
							break;
						}
					}
				}
				if(flag!=1)
					return true;
				else
					return false;
					
				
				
	}
	
	
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("ROW MAGIC MATRIX CHECKING\n----------------------------");
		System.out.println("Enter the size of the first matrix\n");
		System.out.print("Enter the number of rows :");
		int m=s.nextInt();
		System.out.print("Enter the number of columns :");
		int n=s.nextInt();
		int A[][]=new int[m][n];
		System.out.print("Enter the matrix:\n");
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				A[i][j]=s.nextInt();
			}
			
		}
		
		boolean res=isRowMagic(A,m,n);
		if(res==true)
			System.out.println("\nThe Matrix is Row Magic .");
		else
			System.out.println("\nThe Matrix is not Row Magic.");
	}

}
