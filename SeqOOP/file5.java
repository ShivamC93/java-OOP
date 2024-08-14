import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class file5 {//read data from file
    public static void main(String[] args) {
        
        try{
            FileReader f = new FileReader("C:\\Users\\Neha\\OneDrive\\Desktop\\filehandling.txt");
            try{
                int i;
                while((i=f.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                f.close();
            }
        }
        catch(IOException e){
            System.out.println("Exception handled");
        }
    }
}
