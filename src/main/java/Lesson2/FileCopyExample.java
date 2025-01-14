 
package Lesson2;
 
import java.io.*;

public class FileCopyExample {
    
    public static void main(String[] args) {
        
        String sourcePath = "sourceCopy.txt";
        String destinationPath = "destinationCopy.txt";
        
        try{
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destinationPath);
            
            // Read 
            int byteData;
            while( (byteData=fis.read())  !=-1){ 
                
                fos.write(byteData); 
                
            }
            System.out.println("File copied sucessfully!");
                    
        }catch (IOException e){
            System.out.println("Error :"+e.getMessage());
        }
        
        
    }
}
