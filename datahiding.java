package oops;

import aaa.rectangle;

class rectangle{
    private  double length;
     private  double breadth;
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
    public  double getlength()
    {
          return length;
    }
    public void setlength(int l)
    { 
        if(l<0)
        length=0;
        else
        length=l;

          
    }
    public  double getbreadth()
    {
          return breadth;
    }
    public void setbreadth(int b)
    { 
        if(b<0)
        breadth=0;
        else
        breadth=b;

          
    }
}
public class datahiding {
    public static void main(String[] args) {
    
        rectangle r1=new rectangle();
        r1.setlength(10);
        r1.setbreadth(10);
        System.out.println("length is"+r1.getlength());
       System.out.println("breadth is"+ r1.getbreadth());
        
        
        System.out.println("area is"+r1.area());
        System.out.println("perimeter is"+r1.perimeter());
        System.out.println("is it a square"+r1.issquare());
        

    

    }
}
