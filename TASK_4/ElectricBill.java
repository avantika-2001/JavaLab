package Task_4;
import java.util.Scanner;
public class ElectricBill {
	String cust_name;
	int cust_no;
	int units;
	public void Getdata(String name, int no, int n)
	{
		cust_name=name;
		cust_no=no;
		units=n;
	}
	public int Calcbill(int units)
	{
		int amt=0;
		if(units<=100)
		{
			amt=units*1;
		}
		else if(units>=101 && units<200)
		{
			amt=(units-100)*2+100;
		}
		else if(units>=201 && units<400)
		{
			amt=(units-200)*3+200+100;
		}
		else if(units>=400)
		{
			amt=(units-400)*5+300+100;
		}
		return amt;
		
	}
	public void Show(int amt)
	{
		System.out.println("Customer Name:"+cust_name);
		System.out.println("Customer No.:"+cust_no);
		System.out.println("Total Units:"+units);
		System.out.println("E-bill:"+amt);
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no. of users:");
		int n=sc.nextInt();
	    int a[]=new int[n];
		ElectricBill e=new ElectricBill();
		System.out.println("Enter details:");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter customer no:");
			int no=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name of the customer:");
			String name=sc.nextLine();			
			System.out.println("Total units:");
			int units=sc.nextInt();	
			e.Getdata(name,no,units);
			int amt=e.Calcbill(units);	
			e.Show(amt);
		}		
	}

}

