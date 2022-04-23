package Task_1;
import java.util.Scanner;

public class RemoveZeroes {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int con_num=0,rem=0,place=1;
		System.out.println("Enter number:");
		int num= sc.nextInt();
		int temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			if(rem!=0)
			{
				con_num+=(rem*place);
			}
			else
			{
				con_num+=(1*place);
			}
			temp/=10;
			place*=10;
		}
		System.out.println("Number without zeroes:"+con_num);		
	}

}
