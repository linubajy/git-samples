import java.util.*;

public class Area {
	
	public static void rectangle()
	{
		System.out.println("Enter the length :");
		Scanner s =  new Scanner(System.in);
		float len = s.nextFloat();
		System.out.println("Enter the breadth :");
		float bre = s.nextFloat();
		float area = (float)len* bre;
		
		System.out.format("\nArea of Rectangle:%.2f\n",area);
		
	}
	

	public static void triangle()
	{
		System.out.println("Enter the base :");
		Scanner s =  new Scanner(System.in);
		float base = s.nextFloat();
		System.out.println("Enter the height :");
		float hei = s.nextFloat();
		float area=(float)0.5*base*hei;
		
		System.out.format("\nArea of triangle:%.2f\n",area);
		
	}
	
	static void circle()
	{
		System.out.println("Enter the radius :");
		Scanner s =  new Scanner(System.in);
		float r = s.nextFloat();
		float area = (float)(3.14*r*r);
		
		
		System.out.format("\nArea of circle:%.2f\n",area);
		
	}
	
	public static void square()
	{
		System.out.println("Enter the side :");
		Scanner s =  new Scanner(System.in);
		float side = s.nextFloat();
		float area = (float)(side*side);
		
		System.out.format("\nArea of square:%.2f\n",area);
		
		
	}

	public static int display()
	{
		System.out.println("MENU FOR COMPUTING AREA");
		System.out.println("1.AREA OF RECTANGLE");
		System.out.println("2.AREA OF TRIANGLE");
		System.out.println("3.AREA OF CIRCLE");
		System.out.println("4.AREA OF SQUARE");
		System.out.println("5.EXIT");
		System.out.println("Enter the preferred shape:");
		Scanner s = new Scanner(System.in);
		int ch = s.nextInt();
		
		if(ch==1||ch==2||ch==3||ch==4||ch==5)
			return ch;
		else
			return 0;
			
	}
	public static void getAreaByChoice(int ch)
	{
		if (ch==1)
			rectangle();
		else if(ch==2)
			triangle();
		else if(ch==3)
			circle();
		else if(ch==4)
			square();
	
			
		
		
	}

	public static void main(String[] args)
	{
		int ch;
		do
		{
			ch= display();
			
			if(ch==0)
			{
					System.out.println("\nWrong choice.\nEnter a valid choice. \n");
					System.out.println("*******************************************");
						continue;
						
			}
			if((ch!=0)&&(ch!=5))
			{	
				getAreaByChoice(ch);
				System.out.println("*********************************************");
			}
			
			else if(ch==5)
			{
				System.out.println("Exiting!");
				System.out.println("********************************************");
				System.exit(0);
			}
				
			
			 
			
		} while(ch != 5);	
		
		
	}

}
