package oops;
import java.util.*;
class circle{
   public double radius;
 public double area()
    
 {
    double a=Math.PI*radius*radius;
    return a;
 }
 public double perimeter()
 {
    double b=2*Math.PI*radius;
    return b;
 }
}

public class circledemo {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    circle c1=new circle();
    System.out.println("enter value of radius of c1");
    c1.radius=sc.nextDouble();
    System.out.println("area is"+ c1.area());
    System.out.println("perimeter is"+c1.perimeter());
    circle c2=new circle();
    System.out.println("enter value of radius of c2");
    c2.radius=sc.nextDouble();
    System.out.println("area is"+ c2.area());
    System.out.println("perimeter is"+c2.perimeter());

}

}