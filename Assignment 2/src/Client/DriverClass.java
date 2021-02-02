package Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entity.Employee;
import Service.Operations;

public class DriverClass 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		List<Employee> emp=new ArrayList <Employee>();
		Operations o=new Operations();
		int ch=0;
		int flag=0;
		do
		{
			System.out.println("MENU\n******************************");
			System.out.println("1.ADD EMPLOYEE");
			System.out.println("2.UPDATE EMPLOYEE ");
			System.out.println("3.DELETE EMPLOYEE BASED ON ID");
			System.out.println("4.DISPLAY EMPLOYEE COUNT BASED ON TRACK");
			System.out.println("5.EXIT");
			System.out.println("Enter your choice:");
			ch=s.nextInt();
			if(ch==1)
				o.addEmployee(emp);
			else if(ch==2)
				o.updateEmployeeSalary(emp);
			else if(ch==3)
				o.deleteEmployee(emp);
			else if(ch==4)
				o.getEmployeeCountByTrack(emp);
			else if	(ch==5)
			{
				System.out.println("Exiting!");
				flag=1;
				System.exit(0);
			}
			else
			{
				System.out.println("Wrong choice\nTry again!");
			}
		
			
		}while(flag!=1);
		
	}
}
