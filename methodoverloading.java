public class methodoverloading {
   static  int max(int a,int b)
    {
        return a>b?a:b;
    }
   static float max (float a,float b)
    {
         return a>b?a:b;
    }
    static int max(int a,int b,int c)
    {
        return a>b||a>c?a:(b>c?b:c);
    }
    public static void main(String[] args) {
        System.out.println("max is"+ " "+ max(1.2f,1.45f));
        System.out.println("max is"+ " "+ max(110,230)); 
        System.out.println("max is"+ " "+ max(3,4,5));
        
    }
    
    

}


