 
package Lesson2;
 
import java.io.FileInputStream;
import java.io.IOException;

public class ByteCountExample {
    
    public static void main(String[] args) throws IOException {
        
        String filePath = "destinationCopy.txt";
        int byteCount = 0;
        
        FileInputStream fis = new FileInputStream(filePath);
        while(fis.read()!=-1){
            byteCount++;
        }
         
        System.out.println("Total bytes in the file : "+byteCount);
    }
}
