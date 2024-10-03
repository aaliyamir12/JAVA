public class stringdemo1 {
    public static void main(String[] args) {
        String s=new String("Aiman");
       int x= s.length();
       System.out.println(x);
       String a=s.toLowerCase();
       System.out.println(a);
      String b= s.toUpperCase();
       System.out.println(b);
       String str=new String("      showkat   ");
       System.out.println(str);
       System.out.println(str.trim());
       System.out.println(s.substring(2));
       System.out.println(s.substring(2, 4));
       String str2=s.replace('a','q');
       System.out.println(s);
       System.out.println(s.toLowerCase());
    }
}
