package Task_1;
import java.util.*;
public class Array_2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		int row=sc.nextInt();
		System.out.println("Enter no. of columns:");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				 a[i][j]=sc.nextInt();			
			}
		}
		System.out.println("Original Matrix:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				 System.out.print(a[i][j]+" ");			
			}
			System.out.println();
		}
		System.out.println("Matrix after Rotation:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				 System.out.print(a[j][i]+" ");			
			}
			System.out.println();
		}
		System.out.println("Sum of Corner Elements:");
		int sum=a[0][0]+a[0][row-1]+a[col-1][0]+a[row-1][col-1];
		System.out.println(sum);		
	}
}

