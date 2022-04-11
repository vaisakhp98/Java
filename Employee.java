import java.util.*;

public class Employee {
    int eNo,Salary;
    String eName;

    public Employee(int num , int salary , String name) {
        this.eNo = num;
        this.Salary = salary;
        this.eName = name;
    }

    public static void main(String args[]){
    
         Employee emp1 = new Employee(12,15000,"vaisakh");
         Employee emp2 = new Employee(11,15000,"jabir");
         Employee emp3 = new Employee(10,17000,"syam");
         Employee emp4 = new Employee(9,11000,"saru");

        Employee[] employees = {emp1,emp2,emp3,emp4};

        System.out.println("Search Employee with Employee Number :");
        Scanner sc = new Scanner(System.in);
        int empNum = sc.nextInt();


        System.out.println("ALL EMPLOYEES :");
        for (Employee employee : employees){
            System.out.println("Employee No " + employee.eNo + " has a Salary of "  + employee.Salary + " and Name is " + employee.eName);
        
        }
        for (Employee employee : employees){
            
            if (empNum == employee.eNo) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Employee You Searched For is " + employee.eName);
            }
        
        }

        
    }
}
