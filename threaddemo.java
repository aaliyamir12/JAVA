class mythread extends Thread
{   public void run(){
    int i=1;
    while(i<10)
    {
       System.out.println(i +"hello");
       i++;
    }
}
}

public class threaddemo{
      public static void main(String[] args) {
        mythread t=new mythread();
        t.start();
        int i=1;
        while(i<10)
        {
            System.out.println(i+"world");
            i++;
        }
        

        
      }
}