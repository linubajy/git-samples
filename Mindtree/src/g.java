
public class g {

	public static int[] pass(int B[])
	{
		int s=0;
		for(int i=0;i<3;i++)
		{
			B[i]=i+B[i];
		}
		return B;
	}
	
	public static void main(String args[])
	{
		int A[]= new int[] {8,0,9};
		int B[]=pass(A);
		for(int i=0;i<3;i++)
		{
			System.out.println(B[i]);
		}
		
	}
	
}
