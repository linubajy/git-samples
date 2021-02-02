//pg 26
import java.util.Scanner;


public class Retail {
	
		int matrix[][] = new int[5][5];
		
		public static void id()
		{
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number of items:");
			int ne=s.nextInt();
			int matrix[][] = new int[ne][2];
			System.out.println("");
			System.out.println("Enter the id and price:");
			
			for(int i=0;i<ne;i++)
			{
				for(int j=0;j<2;j++)
				{
					matrix[i][j]= s.nextInt();
				}
			}
			//System.out.println("The output:");
			System.out.println("ID"+"\t"+"Price"+"\n");
			for(int i=0;i<ne;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print(matrix[i][j]+"\t");
				}
				System.out.println("\n");
			}
			
				System.out.println("Enter the id to search:");
				//Scanner s = new Scanner(System.in);
				int flag=0;
				int sea = s.nextInt();
				System.out.println("ID"+"\t"+"Price"+"\n");
				for(int i=0;i<ne;i++)
				{
					for(int j=0;j<2;j++)
					{
						if(matrix[i][j] == sea)
						{
							int price=matrix[i][j+1];
								
							System.out.println("ID: "+ matrix[i][j]);
							System.out.println("Price: "+ price);
							System.out.println("\n\n");
							System.out.println("Enter the quantity to purchase: ");
							int qty= s.nextInt();
							int bill_amt = qty * price;
							System.out.println("Bill amount: "+bill_amt);
							flag=1;
							break;
						}
						else
						{
							flag=0;
							break;
						}
						
					}
				}
				//System.out.println("hi");
				if(flag==0)
					System.out.println("\nItem not found!\n");
				
				
				System.out.println("Enter the id to change:");
				int old =s.nextInt();
				System.out.println("Enter the new id :");
				int n =s.nextInt();
				for(int i=0;i<ne;i++)
				{
					for(int j=0;j<2;j++)
					{
						if(matrix[i][j] == old)
						{
						     matrix[i][j]=n;
							
				
						}
					}
				}	
				System.out.println("ID"+"\t"+"PRICE\n");
				for(int i=0;i<ne;i++)
				{
					for(int j=0;j<2;j++)
					{
						System.out.print(matrix[i][j]+"\t");
				
					}
					System.out.println("\n");
				}
				
	}
	public static void main(String args[])
	{
		
		id();

	}



}
