//IA-3
import java.util.*;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int r=(int)(Math.random()*1000)+1;
		int f=0;
		int count=0;
		do 
		{
			
			System.out.println("Enter a number :");
			int a=s.nextInt();
			if(a<r)
			{
				System.out.println("\nToo low");
				count++;
				
			}
			else if(a>r)
			{
				System.out.println("\nToo high.");
				count++;
				
			}
			else if(a==r)
			{
				f=1;
				System.out.println("\nCongratulations!!You found the number "+r+" in "+count+" guesses.");
				break;
			}
			
			
		}while(f!=1);

	}

}
