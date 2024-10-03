import java.lang.*;
class rectangle{
    
    void display()
    {
        System.out.println("a rectangle");
    }
}
    class cuboid extends rectangle{
        
        void display()
        {
            System.out.println("a cuboid");
        }
    }
        
public class overridingdemo {
    public static void main(String[] args) {
        rectangle r=new cuboid();
        r.display();
        

    }
}
