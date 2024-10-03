package ExceptionHandling;
import java.util.*;

class tryCatch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        
        try{
            c=a/b;
            System.out.println(c);
            
            }
        catch(ArithmeticException e){
            System.out.println("try diving by a non-zero number.");
        }
       

        System.out.println("BYE");    


        
    }
}