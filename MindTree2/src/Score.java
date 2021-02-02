//pg 35
import java.util.Scanner;

class Student4
{
	int id;
	String name,branch;
	int mark;
	Student4()
	{
		 this.id=id;
		 this.name=name;
		 this.branch=branch;
		 this.mark=mark;
	}
	void setData(int id,String name,String br,int m)
	{
		this.id=id; 				//(this.field= input value)
		this.name=name;
		this.branch=br;
		this.mark=m;
		
	}
	
	
}


public class Score {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Score l= new Score();
		
		System.out.println("RECORD OF MAXIMUM SCORE\n-------------------------------------\n");
		System.out.println("Enter the number of students:");
		int n= s.nextInt();
		
		Student4 st[]=new Student4[n];//Overall it will be an array
		for(int i=0;i<n;i++)
		{
			st[i]= new Student4();//Each array object of type Student4
			System.out.println("\n\nEnter Student details\n-----------------------");
			System.out.println("Enter student ID:");
			int id=s.nextInt();
			System.out.println("Enter the student name:");
			String name= s.next();
			System.out.println("Enter the branch:");
			String br=s.next();
			System.out.println("Enter the score:");
			int m=s.nextInt();
			System.out.println("-----------------------");
			st[i].setData(id,name,br,m);//initialization
		}
		
		l.disp(n,st);
	}
		void disp(int n,Student4[] st)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=1;j<n;j++)
				{
			
					Student4 temp;
					if(st[i].mark<st[j].mark)
					{
						temp = st[i];
						st[i] = st[j];
						st[j]=temp;
					}
				}
			}
			System.out.println("\n\nStudent with highest marks \n-----------------------------------------");
			System.out.println("ID :"+st[0].id);
			System.out.println("Name :"+st[0].name);
			System.out.println("Branch :"+st[0].branch);
			System.out.println("Score :"+st[0].mark);
		
		}	
		
		
		
 	

}
