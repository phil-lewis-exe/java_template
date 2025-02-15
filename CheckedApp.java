import java.io.*;

public class CheckedApp{
    public static void main(String[] args) {
        String fileName = args[0];
        try {
            readTxtFile(fileName);
        } catch(IOException e) {
            System.out.println(e.getMessage()); //
        };
        System.out.println("Finish");
    }
    public static void readTxtFile(String fileName)  throws IOException {
        // Don’t worry if you don’t understand this statement now. 
        // Just need to know this is to create a reader object 
        // ready to read the text file.
        
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
        
            do {
                line = bufferedReader.readLine();
                System.out.println(line);// print out each line
            } while(line != null);
            bufferedReader.close();// Always close it.


        
        

    }
}