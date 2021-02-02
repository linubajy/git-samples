//pg 33
import java.util.Scanner;

 class student {
	int studentId;
	String studentName;
	float marks;
	boolean secondChance;
	student(){}
	student(int id,String name,boolean secondChance)
	{
		this.studentId=id;
		this.studentName=name;
		this.secondChance=secondChance;
		
	}
	void IdentifyMarks(float m1)
	{
		this.marks=m1;
		
	}
	void IdentifyMarks(float m1 ,float m2 )
	{
		
		this.marks=(m1>m2) ? m1 : m2;
		
	}
	void setter (int id,String name)
	{
		this.studentId=id;
		this.studentName=name;

		
	}
	void getter(int n,student st[]) 
	{
		//this();
		System.out.println("Student Id:"+ this.studentId);
		System.out.println("Student Name:"+ this.studentName);
		System.out.println("Student Marks:"+ this.marks);
		//System.out.println("Student used second chance:"+ this.);
		
		
		
	}

}


public class Demo {

		
		
		public static void main(String[] args) {
			
			//Demo d= new Demo();
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the number of students:");
			int n=s.nextInt();
			student st[]= new student[n];
			for(int i=0;i<n;i++)
			{
				st[i]=new student();
				System.out.println("\n\nEnter id:");
				int studentId =s.nextInt();
			
				System.out.println("Enter the name:");
				String studentName=s.next();
				System.out.println("Enter the marks:");
				float m1=s.nextFloat();
				System.out.println("Did you opt for second chance?(true/false):");
				boolean secondChance=s.nextBoolean();
			
				if(secondChance==false)
					st[i].IdentifyMarks(m1);
				else if(secondChance==true)
				{
					System.out.println("Enter the value for second chance:");
					float m2=s.nextFloat();
					st[i].IdentifyMarks(m1, m2);
				}
				st[i].setter(studentId,studentName);
			}
			System.out.println("\n\nRECORDS\n\n");
			for(int i=0;i<n;i++)
			{
				st[i].getter(n,st);
				System.out.println("\n\n");
			}
			
			
			
				
		
	}

}
