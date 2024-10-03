class rectangle{
    private double length;
    private double breadth;
    public rectangle()
    {
        length=1;
        breadth=1;
    }
    public rectangle( int l,int b)
    {
        length=l;
        breadth=b;

    }
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }

}


public class constructors {
    public static void main(String[] args) {
        rectangle r=new rectangle(10,1);
        System.out.println("area is "+r.area());
        System.out.println("perimeter is"+r.perimeter());
    }
}
