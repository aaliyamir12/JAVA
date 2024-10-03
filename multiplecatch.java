public class multiplecatch {
    public static void main(String[] args) {
        try{
           
            int A[]={1,0,2,3};
            
           System.out.println(A[7]);
           int a=0,b=2,c;
            c=b/a;
        }
        catch(ArithmeticException a)
        {
           System.out.println("demonimator is zero");
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("you are exceeding the arraay limit");
        }
        finally{
            System.out.println("end of program");
        }
    }
}
