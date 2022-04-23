package Task_2;

public class ArrayDemo {
	void ArrayFunc(int arr[], int target)
	{
		int f=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					f=1;
					System.out.println(arr[i]+"+"+arr[j]+"="+target);
				}
			}
		}
		if(f==0)
			System.out.println("NO Pair found!");
	}
	void ArrayFunc(int a[],int p, int b[],int q)
	{
		int w =p+q;
        int m=0,l=0;
        int c[]=new int[w];
        for(int i=0;i<p;i++){
        	c[m]=a[i];
            m++;
        }
        for(int j=0;j<q;j++)
        {
            c[m]=b[j];
            m++;
        }
        for(int k=0;k<m-1;k++)
        {
           for(int z=k+1;z<m;z++)
           {
               if(c[k]>c[z]) {
               int temp=c[k];
               c[k]=c[z];
               c[z]=temp;
               }
           }
       
        }
        for(int i=0;i<p;i++)
        {
            a[i]=c[l];
            l++;
        }
        for(int j=0;j<q;j++)
        {
           b[j]=c[l];
           l++;
        }
        for(int i=0;i<p;i++)
        {
        	System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<q;i++)
        {
        	System.out.print(b[i]+" ");
        }
        System.out.println();
	}

	public static void main(String[] args) {
		int arr[]=new int[]{4, 6, 5, -10, 8, 5, 20};
		int a[]=new int[] { 1, 5, 6, 7, 8, 10};
		int b[]=new int[] { 2, 4, 9};
		ArrayDemo ob=new ArrayDemo();
		ob.ArrayFunc(arr,10);
		ob.ArrayFunc(a,6, b, 3);		
	}

}
