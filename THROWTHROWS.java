public class THROWTHROWS {
    static  void method1 (){
   
        try{
        System.out.println(area(-10,8));
    }
    catch(Exception e){
        System.out.println("enter a positive number");
    }
}
   static int area(int l,int b)throws Exception
    {  if(l<0||b<0)
        throw new Exception("a negative no");
       int a=l*b;
       return a;
    }
   
    

    public static void main(String arr[])throws Exception {
        
            method1();
        
        
        }
      
    
    
}


