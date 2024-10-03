package ExceptionHandling; 
import java.lang.*; 
/**
 * nestedtrycatch
 */
public class nestedtrycatch {

    public static void main(String[] args) {
        try{
            int a[]={1,2,0,4,5};  
            
            try{
                int b=a[1]/a[2];
            }
                catch(ArithmeticException e)

                {
                    System.out.println("a[1]=0");
                }
                System.out.println(a[1]);
            }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("index size is 5");
                }
            }
            
        }


        

        
    
        
    

