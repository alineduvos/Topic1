 
package Lesson2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

 
public class BufferedOutputExample {
    public static void main(String[] args) {
        
          String filePath = "exampleBOF.txt";
            
          String data = "This is written using BufferedOutputStream!";
          try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))){
              
              bos.write(data.getBytes());
              bos.flush(); // ensure that all buffered data is written to the file
              
          }catch (IOException e){
              System.out.println("Error : "+e.getMessage());
          }
          
    }
}
