import java.util.Scanner;
//swapping adjacent elems
public class BubbleSort {
   public static void bubbleSort(int[] arr)
	{		
	   		  //ascending order
		   
		      int n = arr.length;
		      int temp = 0;

		      for(int i = 0; i < n; i++) {
		         for(int j=1; j < (n-i); j++) {
		            if(arr[j-1] > arr[j]) {
		               temp = arr[j-1];
		               arr[j-1] = arr[j];
		               arr[j] = temp;
		            }
		         }
		      }
		   
	}
	
   public static void display(int arr[],int n)
   {
	  

	      for(int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }
	      System.out.println();
   }
   
   
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the number of elements:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] =new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			 arr[i]= s.nextInt();
		}
		
		  System.out.println("Array Before Bubble Sort");
	      display(arr,n);
	     
	      bubbleSort(arr);
	      
	      System.out.println("Array After Bubble Sort");
	      display(arr,n);
		
		
		
	}

}

	   
	