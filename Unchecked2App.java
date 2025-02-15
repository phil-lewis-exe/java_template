public class Unchecked2App{

    public static void main(String args[]){
        System.out.println("### Enter main() ...");
        String s1 = null;//later we’ll change it to null
        System.out.println("s1: " + s1);   

        try {
            methodA(s1);
        } catch (NullPointerException e) {
            System.out.println("### Caught Exception:\n" + e);
        }
       
        System.out.println("### Exit main()!");
    }

    static void methodA(String s1){
        System.out.println("### Enter methodA() ...");
        methodB(s1);
        System.out.println("### Exit methodA()!");
    }

    static void methodB(String s1) {
        System.out.println("### Enter methodB() ...");
        String s2 = s1.toUpperCase();
        System.out.println("s2: " + s2);   
        System.out.println("### Exit methodB()!");
    }
}
