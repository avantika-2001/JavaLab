package Task_2;
import java.util.*;
public class AreaVol {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Area ob1=new Area(12,18);
		Area ob2=new Area(2.75);
		Area ob3=new Area(5,6,7);
		Area ob4=new Area(25);
		Volume ob5=new Volume(24,56);
		Volume ob6=new Volume(3.62);
		Volume ob7=new Volume(17.5,55);
		Volume ob8=new Volume(35);
	}

}
class Area{
	Area(int x,int y)
	{
		System.out.println("Area of Rectangle:"+2*(x+y));
	}
	Area(double x)
	{
		System.out.println("Area of Circle:"+3.14*x*x);
	}
	Area(int x,int y,int z)
	{
		double s=(x+y+z)/2;
		System.out.println("Area of Triangle:"+Math.sqrt(s*(s-x)*(s-y)*(s-z)));
	}
	Area(int x)
	{
		System.out.println("Area of Square:"+x*x);
	}
}
class Volume{
	Volume(int x,int y)
	{
		System.out.println("Volume of Cylinder:"+3.14*x*x*y);
	}
	Volume(double x)
	{
		System.out.println("Volume of Sphere:"+4/3*3.14*x*x*x);
	}
	Volume(double x,double y)
	{
		System.out.println("Volume of Cone:"+3.14/3*x*x*y);
	}
	Volume(int x)
	{
		System.out.println("Volume of Cube:"+x* x*x);
	}
}


