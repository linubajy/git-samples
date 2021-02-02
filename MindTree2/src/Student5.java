//pg 34

import java.util.*;


class Students1
{
	int studentId;
	String studentName="";
	String branch="";
	
	Students1(int studentId,String studentName,String branch)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.branch=branch;
	}
	
}

public class Student5
{	
	static int cse=0,ece=0,eee=0;
	static int n=0;
	static void create(Students1[] c)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of records to add:");
		int no=s.nextInt();
		for(int i=0;i<no;i++)
		{		
				//Scanner s=new Scanner(System.in);
				System.out.println("STUDENT DETAILS\n*************************\n");
				System.out.print("Enter Student Id:");
				int si=s.nextInt();
				System.out.print("Enter Name:");
				String sn=s.next();
				System.out.print("Enter branch:");
				String bn=s.next();
				System.out.println("\n");
				if(bn.equals("ece"))
				{
					ece++;
				}
				else if(bn.equals("cse"))
				{	cse++;
				}
				else if(bn.equals("eee"))
				{
					eee++;
				}
				c[i]=new Students1(si,sn,bn);	
				
				n++;
		}
		
	}
		
		
	static void names(Students1[] c,String bname)
	{	
		
	
		int flag=0;
		System.out.println("\n\nID"+"\t"+"NAME");
		for(int i=0;i<n;i++)
		{	
		
		String temp=c[i].branch;
		
		if(temp.equals(bname))
		{
			System.out.println(c[i].studentId+"\t"+c[i].studentName);
			flag=1;
			
		}
		else
		{
			continue;
		}
		
		}
		if(flag==0)
			System.out.println("NO RECORDS!!!");
	
	}
	static void id(Students1 c[] )
	{
	
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				
				Students1 temp;
				if(c[j].studentId> c[j+1].studentId)
				{
				temp = c[j];
				c[j] = c[j+1];
				c[j+1]=temp;
				}
		}
	}
	
	
	System.out.println("ID IN ASC ORDER \n*******************************");
	System.out.println("ID"+"\t"+"NAME");
	for(int i=0;i<n;i++)
	{
		System.out.println(c[i].studentId+"\t"+c[i].studentName);
	}
	}

	
	
	public static void main(String[] args) 
	{	

		Student5 s=new Student5();
		Scanner obj=new Scanner(System.in);
		
		
		Students1 c[]=new Students1[10];
		int opt=0;
		do
		{
		try
		{Scanner obj1=new Scanner(System.in);
		System.out.println("\nSTUDENT RECORDS\n***************************");
		System.out.print("\n1.CREATE NEW RECORD \n2.DISPLAY STUDENTS NAMES BASED ON BRANCH \n3.DISPLAY ID (ASC ORDER) \n4.EXIT \nEnter choice:");
		opt=obj1.nextInt();
		System.out.println("\n");
		if(opt==1)
		{
			create(c);
			

		}
		else if(opt==2)
		{
			Scanner st=new Scanner(System.in);
			System.out.print("Enter branch Name:");
			String bname=st.nextLine();
			names(c,bname);
			
		}
		else if(opt==3)
		{
			id(c);
		}
		
		else if(opt==4)
		{
			System.out.println("Exiting!!");
			System.exit(0);
		}
		}
		catch(Exception e)
			{
				System.out.println(e);
				continue;
			}
		}while(opt!=4);
	}
}