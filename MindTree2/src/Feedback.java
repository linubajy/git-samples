
//pg31
import java.util.Scanner;

public class Feedback {
    
	int n;
	String Name;
	String MobileNo;
	double feedbackRating;
	double r[]=new double[n];
	
	Feedback()
	{
		Name="Default name";
		MobileNo="1234567890";
		feedbackRating=0.00;
	}
	
	void Customer(String Name,String MobileNo,double feedbackRating)
	{
		this.Name=Name;
		this.MobileNo=MobileNo;
		this.feedbackRating=feedbackRating;
		
	}
	void getters() {}
	void setters(double r[],int n) 
	{
		System.out.println("FEEDBACKS:");
		for(int i=0;i<n;i++)
		{
			System.out.println("Customer "+(i+1)+":"+r[i]+" out of 5");
		}
	}
	
	
	public static void main(String[] args) {
		
		
		//String Name;
		//String MobileNo;
		//double feedbackRating;
		Feedback e = new Feedback();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of customers: ");
		int n = s.nextInt();
		double r[]= new double[n];
		try {
		for(int i=0;i<n;i++)
		{
			
			System.out.println("\n\nEnter customer name:");
			 String Name=s.next();
			 System.out.println("Enter customer mobile number:");
			 String MobileNo=s.next();
			 while(MobileNo.length()!=10)
				 {
					 System.out.println("Invalid number.\nEnter the mobile number:");
					 MobileNo=s.next();
				 }
			System.out.println("Enter customer rating (out of 5):");
			 double feedbackRating=s.nextDouble();
			 while(feedbackRating < 0 ||  feedbackRating>5)
			 {
				 System.out.println("Not a valid number!");
				 System.out.println("Enter customer rating (out of 5):");
				 feedbackRating=s.nextDouble();
			 }
			 r[i]=feedbackRating;
			   e.Customer(Name, MobileNo , feedbackRating);
			 
			
		}
		e.setters(r,n);
		
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
	}

}
