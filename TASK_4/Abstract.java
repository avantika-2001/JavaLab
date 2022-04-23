package Task_4;
abstract class A{
	abstract void show();
	void fun()
	{
		System.out.println("Class A is an abstract class");
	}
}
class B extends A{
	void show()
	{
		System.out.println("Class B!");
	}
}
class C extends A{
	void show()
	{
		System.out.println("Class C!");
	}
}
public class Abstract {
	public static void main(String []args)
	{
		B ob1=new B();
		C ob2=new C();
		ob1.fun();
		ob2.fun();
		ob1.show();
		ob2.show();
	}

}
