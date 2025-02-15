import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        // System.out.print("Enter your name: ");

        // Read in line from standard input
        // String name = in.nextLine();

        // System.out.println("Hi " + name + "!"); //a 


        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt(); // Reads in an int from standard input
        
        in.nextLine();
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        double sum = 0;
        int x = startNum;
        int n = 0;
        do  {
            sum += x*x;
            ++x;
            ++n;
        } while (x <= endNum);
        System.out.println("Average of squares from " + startNum + " to " + endNum + ":");
        System.out.println( sum / (double) n);
    }
}