import java.util.Scanner;//import the Scanner class from the java.util

public class PrintPattern2 {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Get the numerical data inputs
        int size;
        do {
        System.out.print("Please enter pattern size: ");
        size = in.nextInt();
        if (size<1) { System.out.println("Too small!"); size=-1;}
        if (size>5) {System.out.println("Too big!"); size=-1;}
        } while (size==-1);
        System.out.println();
        System.out.println("Here is your pattern:");
        System.out.println();

        // Print a newline after printing all the columns
        // Outer loop to print each of the rows
        for (int row = 1; row <= size*2; row++) {
        // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size*2; col++) {
                int i_val = (col<(size+1))?col:2*size-col+1;
                int j_val = (row<(size+1))?row:2*size-row+1;
                System.out.print(i_val+j_val-1);
            }
            System.out.println();
        }
    }
}