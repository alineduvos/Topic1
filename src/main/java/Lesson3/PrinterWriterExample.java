 
package Lesson3;

import java.io.IOException;
import java.io.PrintWriter;

 
public class PrinterWriterExample {
    
    public static PrintWriter p = new PrintWriter(System.out, true);
    
    public static void main(String[] args) { 
        
        p.println("Hello from the console!");
        
        PrintWriter writer = null;
        try{
            
            writer = new PrintWriter("person.txt");
            writer.println("John Wick");
            writer.println("This is a test.");
            writer.close();
            writer.printf("Hello, %s!%n", "Alin");
            writer.printf("Your balance is R%.2f%n", 123.456);
            
        }catch (IOException e){
            p.println("Error : "+e.getMessage());
        }finally{
            if(writer!=null){
                if(writer.checkError()){
                    System.out.println("There was a problem!");
                }else{
                    System.out.println("No problem.");
                }
            }
        }
        
    }
    
}
