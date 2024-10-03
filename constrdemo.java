class cylinder
{
    private double  radius;
    private double  height;
    public double getradius()
    {
        return radius;
    }
   public double getheight(){
        return height;
    }
    public void setheight(double h)
    {
        height=h;
    }
    public void setdimensions( double h,double r)
    {
        height=h;
        radius=r;
    }
    public  double lateralsurfacearea()
    {
        return 2*Math.PI*radius*height;
    }
    public cylinder(){
        radius=1;
        height=1;
        
    }
    public cylinder(double r,double h)
    {
        radius=r;
        height=h;
    }
    public cylinder(double r)
    {
        radius=r;
    }


}
public class constrdemo {


    public static void main(String[] args) {
        cylinder c=new cylinder(10,1);
        System.out.println("lateralsurfacearea is" + c.lateralsurfacearea());
    }
}
