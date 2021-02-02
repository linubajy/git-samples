import java.util.Scanner;

public class test2 {

	public static void sol(int a[],int m,int n)
	{
		System.out.println("j");
		int c=0;
		for(int i=1;i<=n;i++)
		{
			while(a[i]>0)
			{
				 a[i]=a[i]%m;
				 a[i]=a[i]-m;
				 c++;
			}
		}
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the types f candies:");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the number of candies for type "+i);
			a[i]=s.nextInt();
		}
		
		System.out.println("Max candies per day:");
		int m=s.nextInt();
		sol(a,m,n);
	}

}
