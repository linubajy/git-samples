
import java.util.Scanner;


public class set2_01 {

	
	//private static final int c= 0;
	//custno = ++cno;
		
		int matrix[][] = new int[5][5];
		
		public static void id()
		{
			int matrix[][] = new int[5][5];
			System.out.println("");
			System.out.println("Enter the id and price:");
			Scanner s = new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<2;j++)
				{
					matrix[i][j]= s.nextInt();
				}
			}
			System.out.println("The output:");
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println("\n");
			}
			
				System.out.println("Enter the id to search");
				//Scanner s = new Scanner(System.in);
				int sea = s.nextInt();
				for(int i=0;i<5;i++)
				{
					for(int j=0;j<2;j++)
					{
						if(matrix[i][j] == sea)
						{
							int price=matrix[i][j+1];
							System.out.println("Price: "+ matrix[i][j+1]);
							System.out.println("\n\n");
							System.out.println("Enter the quantity to purchase: ");
							int qty= s.nextInt();
							int bill_amt = qty*price;
							System.out.println("Bill amount: "+bill_amt);
							
						}
					}
				}
				System.out.println("Enter the id to change:");
				int old =s.nextInt();
				System.out.println("Enter the new id :");
				int n =s.nextInt();
				for(int i=0;i<5;i++)
				{
					for(int j=0;j<2;j++)
					{
						if(matrix[i][j] == old)
						{
						     matrix[i][j]=n;
							//System.out.println(matrix[i][j+1]+" ");
				
						}
					}
				}	
				System.out.println("ID  PRICE\n");
				for(int i=0;i<5;i++)
				{
					for(int j=0;j<2;j++)
					{
						System.out.print(matrix[i][j]+" ");
				
					}
					System.out.println("\n");
				}
				
	}
	public static void main(String args[])
	{
		id();
		//search();
	}

}
