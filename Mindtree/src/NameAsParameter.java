import java.util.Scanner;

public class NameAsParameter {

	public static void name(String name)
	{
		System.out.println("Hello , "+ name +".");
		
	}
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = s.nextLine();
		name(name);
		
		
		
		
		
	}
	
}
