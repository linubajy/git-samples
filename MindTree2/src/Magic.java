//pg 40
import java.util.Scanner;

public class Magic {
	
	static int count=0;
	public static boolean isMagic(int A[][],int m,int n)
	{
		//Computing sum of each row
		//static int count=0;
		int New[]=new int[m+n+2];
		
		for(int i=0;i<m;i++) //Row 
		{
			int row=0;
			for(int j=0;j<n;j++)
			{
				row=row+A[i][j];
				
			}
			New[count]=row;
			count++;
			
		}
		
		
		
		for(int i=0;i<n;i++) //Col 
		{
			int col=0;
			for(int j=0;j<n;j++)
			{
				col=col+A[j][i];
				
			}
			New[count]=col;
			count++;
			
		}
		
		int mdia=0,sdia=0;
		for(int i=0;i<m;i++) //Dia
		{
			
			for(int j=0;j<n;j++)
			{
				if(i==j)
					mdia=mdia+A[i][j];
				else if(i+j==m-1)
					sdia=sdia+A[i][j];
				
			}
		}
		New[count]=mdia;
		count++;
		New[count]=sdia;
		
		
		//Iterating through the array New with all row,col & diagonal sum
		int flag=0;
		for(int i=0;i<m;i++)
		{
			for(int j=i+1;j<m;j++)
			{
				if(New[j]!=New[j+1])
				{	
					flag=1;
					break;
				}
				
			}
		}
		
		for(int i=0;i<m+n+2;i++)
		{
			System.out.println(New[i]);
		}
		
		
		if(flag!=0)
			return false;	
		else 
			return true;
			
	}
	

	public static void main(String[] args) {
		
		
			Scanner s=new Scanner(System.in);
			System.out.println("MAGIC MATRIX CHECKING\n-------------------------------\n");
			System.out.println("Enter the size of the first matrix\n");
			System.out.print("Enter the number of rows :");
			int m=s.nextInt();
			System.out.print("Enter the number of columns :");
			int n=s.nextInt();
			if(m!=n)
			{
				System.out.println("Not a square matrix!");
				System.exit(0);
			}
		
			int A[][]=new int[m][n];
			System.out.print("Enter the matrix:\n");
			
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					A[i][j]=s.nextInt();
				}
			
			}
		
		boolean res=isMagic(A,m,n);
		if(res==true)
			System.out.println("\nThe Matrix is Square Magic .");
		else if(res==false)
			System.out.println("\nThe Matrix is not Square Magic.");

		
	}

}
