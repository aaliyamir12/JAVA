package inheritance;
class circle{
    double radius=2;
   double area()
    {
         return Math.PI*radius*radius;
    }
    double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public circle()
    {
        System.out.println("parent constructor");
    }

}
class cylinder extends circle{
      double height;
      double volume()
      {
        return Math.PI*radius*radius*height;
      }
      public cylinder()
        {
           System.out.println("child constructor");
        }
      
    }
    
public class  inheritconstructor{
    public static void main(String args[])
    {   int x;
        cylinder cy=new cylinder( );
       

    }
}

