class addition extends Thread
{ public void run(){
 int a=2;
 int b=4;
 int c=a+b;
 System.out.println(c);  
}
}

class multiplication extends Thread
{public void run(){
 int a=2;
 int b=4;
 int c=a*b;
 System.out.println(c);
}
}
class division extends Thread
{ public void run(){
 int a=2;
 int b=4;
 int c=a/b;
 System.out.println(c);
}
}
class modulus extends Thread
{ public void run(){
 int a=2;
 int b=4;
 int c=a%b;
 System.out.println(c);
}
}
public class multiplethreads {
    public static void main(String[] args) {
        addition a=new addition();
        multiplication m=new multiplication();
        division d=new division();
        modulus mo=new modulus();
        a.start();
        m.start();
        d.start();
        mo.start();


        
        

    }
}
