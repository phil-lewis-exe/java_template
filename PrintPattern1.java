import java.util.Scanner;//import the Scanner class from the java.util

public class PrintPattern1 {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Get the numerical data inputs
        System.out.print("Please enter pattern size: ");
        int size = in.nextInt();
        System.out.println();
        System.out.println("Here is your pattern:");
        System.out.println();

        // Print a newline after printing all the columns
        // Outer loop to print each of the rows
        for (int row = 1; row <= size; row++) {
        // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print(col);
                }
            }
            System.out.println();
        }
    }
}