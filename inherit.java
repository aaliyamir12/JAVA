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

}
class cylinder extends circle{
      double height;
      double volume()
      {
        return Math.PI*radius*radius*height;
      }
    }
public class  inherit{
    public static void main(String args[])
    {
        cylinder cy=new cylinder();
        System.out.println("area of cylinder"+" " +cy.area());
        System.out.println("perimeter of cylinder is"+ " " +cy.perimeter());

    }
}
