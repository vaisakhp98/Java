import java.util.*;
class employee
{
	int eno,esalary;
	String ename;
	public employee()
	{
	}
	public employee(int no,int sal,String name)
	{
		eno=no;
		esalary=sal;
		ename=name;
	}
	public void showData()
	{
		System.out.print("Emp Id= "+eno+" "+"Employee name= "+ename+" salary= "+esalary);
		System.out.println();
	}
}
public class ArrObjects
{
	public static void main(String args[])
	{
		System.out.print("Enter the no:of employees :");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();	
		System.out.print("Enter the employee details one by one\n");
		employee employees[]=new employee[n];
		Scanner obj_emp=new Scanner(System.in);
		int eid,esal;
		String ename;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+i+" employee details:");
			System.out.println("Enter the employee id: ");
			eid=obj_emp.nextInt();
			System.out.println("Enter the employee name: ");
			String name=obj_emp.next();
			ename=new String(name);
			System.out.println("Enter the employee salary: ");
			esal=obj_emp.nextInt();
			employee emp=new employee(eid,esal,ename);
			employees[i]=emp;
		}
		System.out.println("Employees are: ");
		for(employee y : employees)
			y.showData();
		System.out.print("Enter the employee number to search: ");
		int semp=obj.nextInt();
		boolean found=false;
		for(employee e:employees)
		{
			if(semp==e.eno)
			{
				found=true;
				System.out.println("Employee found");
				e.showData();
				break;
			}
		}
		if(!found)
		{
			System.out.println("Item not found");
		}
	}
}

Output
------

Enter the no:of employees :3
Enter the employee details one by one
Enter 0 employee details:
Enter the employee id:
123
Enter the employee name:
Thasni
Enter the employee salary:
50000
Enter 1 employee details:
Enter the employee id:
12
Enter the employee name:
Reshma
Enter the employee salary:
56000
Enter 2 employee details:
Enter the employee id:
100
Enter the employee name:
Jabir
Enter the employee salary:
60000
Employees are:
Emp Id= 123 Employee name= Thasni salary= 50000
Emp Id= 12 Employee name= Reshma salary= 56000
Emp Id= 100 Employee name= Jabir salary= 60000
Enter the employee number to search: 123
Employee found
Emp Id= 123 Employee name= Thasni salary= 50000
		
