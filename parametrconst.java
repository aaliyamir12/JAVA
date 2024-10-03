package inheritance.parameterizedconstructor;



    
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
        System.out.println(" non parametr of parent constructor");
    }
    public circle(int y)
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
        System.out.println("non paramet of chid ");
      }
      public cylinder(int x)
        {  super(x);
           System.out.println("child constructor");
        }
      
    }
    
public class parametrconst{
    public static void main(String args[])
    {   
        cylinder cy=new cylinder(2 );
       

    }
}



