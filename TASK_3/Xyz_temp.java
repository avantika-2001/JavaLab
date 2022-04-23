package Task_3;

abstract class Temperature{
	double temp;
	void setTempData(double t)
	{
		temp=t;
	}
	abstract void changeTemp();
}
class Fahrenheit extends Temperature{
	double ctemp;
	void changeTemp()
	{
		ctemp=(5*(temp-32))/9;
		System.out.println("Temperature in Celsius:"+ctemp+"C");
	}
}
class Celsius extends Temperature{
	double ftemp;
	void changeTemp()
	{
		ftemp=1.8*temp+32;
		System.out.println("Temperature in Fahrenheit:"+ftemp+"F");
	}
}
public class Xyz_temp {
	public static void main(String []args)
	{
		Celsius c=new Celsius();
		Fahrenheit f=new Fahrenheit();
		c.setTempData(100);
		f.setTempData(98);
		c.changeTemp();
		f.changeTemp();
	}

}
