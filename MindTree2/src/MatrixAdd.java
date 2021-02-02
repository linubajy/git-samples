
import java.util.Scanner;

//pg 38
public class MatrixAdd {
	

	public static void main(String[] args) {
		
		//1st matrix
		Scanner s=new Scanner(System.in);
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
		System.out.print("\n");
		//2nd matrix
		
		System.out.print("Enter the size of the second matrix\n");
		System.out.print("Enter the number of rows :");
		int p=s.nextInt();
		System.out.print("Enter the number of columns :");
		int q=s.nextInt();
		
		do
		{
			if(n!=p)
			{
				System.out.println("\nMatrix sizes not compactible");
				System.out.println("***************************************************************");
			
			
				System.out.print("Enter the size of the second matrix\n\n");
				System.out.print("Enter the number of rows :");
				p=s.nextInt();
				System.out.print("Enter the number of columns :");
				q=s.nextInt();
				
			}
			
		}while(n!=p);
	
		
			System.out.println("\nEnter the matrix:");
			int B[][]=new int[p][q];
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<q;j++)
				{
					B[i][j]=s.nextInt();
				}
				
			}
		
		
		//Computing 3rd matrix
		
		 System.out.print("\n");
			System.out.print("Summation Matrix\n\n");
			
			int C[][]=new int[m][q];
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<q;j++)
				{
					C[i][j]=A[i][j]+B[i][j];
					System.out.print(C[i][j]+" ");
				}
				System.out.print("\n");
			}
		
		
		
		
		
	}

}
