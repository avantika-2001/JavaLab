package Task_2;
import java.util.*;
public class ZigZag {
    static void swap(int []a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void sort(int []a,int n)
    {
        for(int i=0;i<n-2;i+=2)
        {
            if(a[i]>a[i+1]) 
                swap(a,i,i+1);
            if(a[i+1]<a[i+2])
                swap(a,i+1,i+2);
        }
    }
    public static void main(String []args)
    { 
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array ");
    n=sc.nextInt(); 
    int []a=new int [n]; 
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    sort(a,n);
    for(int i=0;i<n;i++)
    System.out.print(a[i]+" ");
    }
    
}
