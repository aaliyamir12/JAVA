package oops;
import java.util.*;
class rectangle{
    public double length;
    public   double breadth;
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean issquare()
    {
        if(length==breadth)
        return true;
        else 
        return false;
        
        
    }
}
public class rectangledemo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        rectangle r1=new rectangle();
        System.out.println("enter length and breadth");
        r1.length=s.nextDouble();
        r1.breadth=s.nextDouble();
        System.out.println("area is"+r1.area());
        System.out.println("perimeter is"+r1.perimeter());
        System.out.println("is it a square"+r1.issquare());
        

    

    }
}
