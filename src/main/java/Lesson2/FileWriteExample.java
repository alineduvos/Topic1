 
package Lesson2;
 
import java.io.*;


public class FileWriteExample {
    
    public static void main(String[] args) {
        
        String filePath = "output.txt";
        String data = "Hello, this is the file contents!";
        
        try(FileOutputStream fos = new FileOutputStream(filePath)){
            
            // Convert string to a byte array 
            fos.write(data.getBytes());
            
            System.out.println("Data written to file!");
            
        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
        
        
    }
}
