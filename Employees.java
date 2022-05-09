import java.util.*;

class Employees{
	int emp_no;
	String emp_name;
	int salary;

	Employees(int emp_no, String emp_name,int salary){
		this.emp_no = emp_no;
		this.emp_name = emp_name;
		this.salary = salary;
	}
	public static void main(String args[]){
		
			
	
		Scanner sc = new Scanner(System.in);
		System.out.print(" The number of employee : ");
		int[] eNum = new int[3];
		String[] eName = new String[3];
		int[] eSalary = new int[3];

		int Search = sc.nextInt();
		int NoOfEmployee = sc.nextInt();
		Employees[] emp = new Employees[3];
		

		System.out.print(" Search for employee : ");
		
		for(int i = 0; i<=NoOfEmployee ;i++){
			
			System.out.println(" The Employee Number : ");
			eNum[i] = sc.nextInt();

			System.out.println(" The Employee Name : ");
			eName[i]=sc.next();
			
			System.out.println(" The Employee Salary : ");
			eSalary[i] = sc.nextInt();
			emp[i] = new Employees(eNum[i] , eName[i],eSalary[i]);

			if(Search == eNum[i]){
				System.out.println("Employee is here ");
			}
		}
		System.out.println("the nums are : ");

		for (int i = 0;i<=NoOfEmployee;i++){
		System.out.println(eNum[i] + "is the number" + eName[i] + "is the name " + eSalary[i] + "is the salary ");
		}

}
}