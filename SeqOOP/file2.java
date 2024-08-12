import java.io.File;

public class file2 {//filr info
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Neha\\OneDrive\\Desktop\\filehandling.txt");
        if(f.exists()){
            System.out.println("File name:" + f.getName());
            System.out.println("File path:" + f.getAbsolutePath());
            System.out.println("File size:" + f.length());
            System.out.println("file writable" + f.canWrite());
            System.out.println("file readable" + f.canRead());
        } else{
            System.out.println("File not found");
        }
    }
    
}
