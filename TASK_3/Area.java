package Task_3;
import java.util.Scanner;
abstract class Shape{
    abstract void CircleArea(float x);
    abstract void RectangleArea(float x,float y);
    abstract void SquareArea(float a);
}
class Area extends Shape {
    void CircleArea(float x) {
        float a1 = 3.14f * x * x;
        System.out.println("Area of Circle:" + a1 + " sq units");
    }

    void RectangleArea(float x, float y) {
        float a2 = x*y;
        System.out.println("Area of Rectangle:" + a2 + " sq units");
    }

    void SquareArea(float a) {
        float a3 = a * a;
        System.out.println("Area of square:" + a3 + " sq units");
    }
    public static void main(String []args)
    {
        float r,l,b,a;
        Area ob=new Area();
        Scanner sc=new Scanner(System.in);       
        System.out.println("Enter radius of circle:");
        r=sc.nextFloat();
        ob.CircleArea(r);
        System.out.println("Enter length and breadth of rectangle:");
        l=sc.nextFloat();
        b=sc.nextFloat();
        ob.RectangleArea(l,b);
        System.out.println("Enter edge of square:");
        a=sc.nextFloat();
        ob.SquareArea(a);
    }
}
