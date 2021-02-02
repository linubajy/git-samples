import java.util.Scanner;

public class ArraySum {
	
	public static int sum(int a[],int n)
	{
		int sum1=0;
		for(int i=0;i<n;i++)
		{	
			sum1= sum1 + a[i];	
		}
		return sum1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= new int[10];
		System.out.println("SUM OF ELEMENTS\n");
		System.out.print("Enter the number of elements:");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			
			a[i]= s.nextInt();
			
		}
		
		int sum1=sum(a,n);
		
		System.out.println("Sum of array:"+sum1);
		
	}

}
