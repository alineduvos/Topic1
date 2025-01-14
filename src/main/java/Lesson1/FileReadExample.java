 
package Lesson1;

import java.io.FileInputStream;
import java.io.IOException;


 
public class FileReadExample {
    
    public static void main(String[] args) {
        
        FileInputStream fis = null;
        
        try {
            String filePath = "example.txt";
            fis = new FileInputStream(filePath);
            
            int byteData; // to case the character later for display
            System.out.println("File Contents : ");
            
            while((byteData = fis.read()) != -1){
                System.out.print((char)byteData);
            }
            
        } catch (IOException ex) {
            System.out.println("Error : "+ex.getMessage());
        }  
        
    }
    
}
