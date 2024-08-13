//write in file
import java.io.*;

public class file3 {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("C:\\Users\\Neha\\OneDrive\\Desktop\\filehandling.txt");
            try{
                f.write("Java is best programming language");
            }
            finally{
                f.close();//for security we use finally to close file
            }
            System.out.println("Successfully Data wrote in file");
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}
