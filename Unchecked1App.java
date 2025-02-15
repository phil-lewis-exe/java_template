public class Unchecked1App{
    public static void main(String args[]){
        System.out.println("### Enter main() ...");
        String s1 = "cat";
        String s2 = null;
        
        try {
            s2 = s1.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("### Caught Exception:\n" + e);
        }
        
        
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);   

        System.out.println("### Exit main()!");
  } 
}