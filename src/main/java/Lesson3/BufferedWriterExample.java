 
package Lesson3;

import java.io.*;

 
public class BufferedWriterExample {
    
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("myfile1.txt"))){
            
            writer.write("First line of file...");
            writer.newLine();
            writer.write("Another line...");
            
        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
