//IA-3
import java.util.*;

public class SubsetSum {
    public static void find(int[] A, int currSum, int index, int sum, int[] solution) {
        if (currSum == sum)
        {
         System.out.println("\n");
          for (int i = 0; i < solution.length; i++) 
          {
            if (solution[i] == 1)
            {
              System.out.print("  " + A[i]);
            }
          }

        } 
        else if (index == A.length) 
        {
          return;
        } 
        else 
        {
          solution[index] = 1;// select the element
          currSum += A[index];
          find(A, currSum, index + 1, sum, solution);
          currSum -= A[index];	
          solution[index] = 0;// do not select the element
          find(A, currSum, index + 1, sum, solution);
        }
        return;
      }
      public static void main(String[] args)
      {
    	 Scanner s = new Scanner(System.in);
  		System.out.println("Enter the no of elements in Array:");
  		int n=s.nextInt();
  		int A[]= new int[n];
  		
  		System.out.println("Enter the elements :");
  		for(int i=0;i<n;i++)
  		{
  			A[i]=s.nextInt();
  			
  		}	
  		System.out.println("Enter the sum:");
  		int sum=s.nextInt();
        
        int[] solution = new int[n];
        System.out.println("Sum found");
        find(A, 0, 0, sum, solution);							//0-current sum and index
      }
}

