package Service;
import java.util.List;

import Entity.Employee;
 

public interface ServiceInterface
{
	public  List<Employee> addEmployee(List<Employee> emp); 
	public  List<Employee> updateEmployeeSalary (List<Employee> emp);
	public  List<Employee> deleteEmployee (List<Employee> emp) ;
	public  List<Employee> getEmployeeCountByTrack (List<Employee> emp) ;
	
}
