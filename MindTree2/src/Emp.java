//pg 27

import java.util.Scanner;

public class Emp {
	Emp(){}    //constructor
	
	int empId;
	String empName;
	String empDesig;
	String empDept;
	
	//Employee(){}
	//Employee(int,String,String,String){}
	//void getters(String)

	void setter(String d)
	{
		
			
			if((d.contentEquals("developer"))||(d.contentEquals("tester"))||(d.contentEquals("lead"))||(d.contentEquals("manager")))
			{
				empDesig = d;
				System.out.println("Designation: "+d);
			}
			else
			{
				System.out.println(" Wrong designation!");
			}
		
		
	}
	
	void setEmpName(String a)
	{
		
		try
		{
			empName=a;
			System.out.println("empName: " +a);
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception ");
		}
		
	}
	void setID(int i)
	{
		try
		{
			empId = i;
			System.out.println("ID: "+i);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
	}
	void empDept(String dep )
	{
		
			
			if((dep.contentEquals("TTH"))||(dep.contentEquals("RCM"))||(dep.contentEquals("digital"))||(dep.contentEquals("devops")))
			//if((dep.equals("TTH")=='false'||(dep.equals("RCM")=='false'||(dep=="Digital")||(dep=="DevOps"))
			{
				empDept = dep;
				System.out.println("Dept: "+dep);
			}
			else
			{
				System.out.println(" Invalid dept!");
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Employee e = new Employee();
			Emp e = new Emp();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the id:");
			int i =s.nextInt();
			System.out.println("Enter the name:");
			String a =s.next();
			
			System.out.println("Enter the designation:");
			String d =s.next();
			
			System.out.println("Enter the dept:");
			String dep =s.next();
			
		
			e.setID(i);
			e.setEmpName(a);
			e.setter(d);
			e.empDept(dep);
	}

}
