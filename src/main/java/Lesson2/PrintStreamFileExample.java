 
package Lesson2;

import java.io.FileNotFoundException;
import java.io.PrintStream;

 
public class PrintStreamFileExample {
    public static void main(String[] args) {
        
        // Writeing to a file
        String filePath = "outputPrintStream.txt";
        try(PrintStream ps = new PrintStream(filePath)){
            
            ps.println("Hello, File!");
            
            // %n = new line
            // %s = string

            ps.printf("%-10s %10s%n", "Item","Price"); 
            ps.printf("%-10s %10s%n","Book",20);           
            ps.printf("%-10s %10s%n","Pen",10);

        }catch (FileNotFoundException e){
            System.out.println("Error : file not found.");
        }
        
        
    }
}
