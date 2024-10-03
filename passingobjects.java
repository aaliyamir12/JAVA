class array{
     static void change(int x[],int index,int value)
     {
        x[index]=value;
        
     }
     static void change2(int x,int value)
     {
        x=value;
     }
     public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        for( int x: A)
        {
            System.out.println(x);
        }
        
        
        change(A,1,20);
       
        for( int x: A)
        {
            System.out.println(x);
        }
        int b=10;
        change2(b,11);
        System.out.println("value of b is"+b);
        
    
     }
   
}