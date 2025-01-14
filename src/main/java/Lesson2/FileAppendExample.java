 
package Lesson2;
 
import java.io.FileOutputStream;
import java.io.IOException;

public class FileAppendExample {
    
    public static void main(String[] args) {
        String filePath = "outputAppend.txt";
        String myDataToWrite = "\nHello there!";
        
        try(FileOutputStream fos = new FileOutputStream(filePath, true)){
            
            fos.write(myDataToWrite.getBytes());
            System.out.println("Data appended to file.");
            
        }catch(IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
