import java.util.Scanner;

public class MaxOfThree {

	public static void maxi( int a ,int b, int c)
	{
		if(a>b&& a>c)
			System.out.println("The greatest value is " +a);
		else if(a<b && b>c)
			System.out.println("The greatest value is " +b);
		else if (c>a && c>b)
			System.out.println("The greatest value is " +c);
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a= s.nextInt();
		int b= s.nextInt();
		int c= s.nextInt();
		maxi(a,b,c);

	}

}
