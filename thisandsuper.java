class rectangle{
    int length;
    int breadth;
    int x=5;
    rectangle (int l,int b)
    {
        length=l;
        breadth=b;

    }
   
    void display()
    {
        System.out.println("length is:" +length);
        System.err.println("breadth is:" +breadth);
    }

}
class cuboid extends rectangle {
    int height;
    int x=3;
    cuboid(int l,int b,int h){
        super(l,b);
        height=h;
        System.out.println(x);
        System.out.println(super.x);

    }
}
public class  thisandsuper{
    public static void main(String[] args) {
        rectangle r=new rectangle(10 ,20);
        r.display();
       cuboid c=new cuboid(10,20,30);
    }
}