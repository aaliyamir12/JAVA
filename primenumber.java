
import java.util.*;
public class primenumber {
    static boolean isprime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            return false;
            
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner s=new Scanner(System.in);
        int a;
        a=s.nextInt();
        System.out.println("the no is prime" +" "+ isprime(a));

    }
    
}
