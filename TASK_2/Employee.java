package Task_2;
import java.util.*;
class Employee {
	Scanner sc=new Scanner(System.in);
	String EmployeeName;
	int EmployeeId;
	double basicSalary;
	public void Emp(String n, int id, double sal)
	{
		EmployeeName=n;
		EmployeeId=id;
		basicSalary=sal;
	}
	void displayInfo()
	{
		System.out.println("Name of Employee:"+EmployeeName);
		System.out.println("Employee ID:"+ EmployeeId);
		System.out.println("Basic Salary:"+basicSalary);
	}
}
class SalaryCalculator extends Employee
{
	double hra=0,da=0,pf=0;
	double grossSalary=0;
	SalaryCalculator(double hra,double da, double pf)
	{
		this.hra=hra;
		this.da=da;
		this.pf=pf;
	}	
	void grossCal()
	{
		grossSalary=basicSalary+hra+da+pf;
	}
	void showSalarySlip()
	{
		System.out.println("Salary slip of Employee:"+grossSalary);
	}

}
public class Xyz{
	public static void main(String[] args) {
		SalaryCalculator ob=new SalaryCalculator(20000,12000,5000);
		ob.Emp("Avantika",2098,50000);
		ob.displayInfo();
		ob.grossCal();
        ob.showSalarySlip();
	}
}
