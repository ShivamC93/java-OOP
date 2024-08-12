import java.io.*;

public class file1 {//create file
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Neha\\OneDrive\\Desktop\\filehandling.txt");
        try{
            if(f.createNewFile()){
                System.out.println("file created");
            } else{
                System.out.println("file already exists");
            }
        }
        catch(IOException e){
            System.out.println("error");
        }
    }
}
