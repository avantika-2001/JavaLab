package Task_1;
import java.util.*;
public class MaturityAmt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Amount:");
		double p=sc.nextDouble();
		System.out.println("Enter Rate of Interest:");
		double r=sc.nextDouble();
		System.out.println("Enter Time period:");
		int n=sc.nextInt();
		System.out.println("Choose Option 1 or 2:");
		int ch=sc.nextInt();
		double A1,A2;
		switch(ch)
		{
		case 1:
			A1 = p*(1 + r / 100)*n;
			System.out.println("Maturity Amount:"+A1);
			break;
		case 2:
			A2 = p * n + p * n*(n + 1) / 2 * r / 100 * 1 / 12;
			System.out.println("Maturity Amount:"+A2);
			break;
		}
	}
}
