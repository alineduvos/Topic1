 
package Lesson3;

import java.io.IOException;
import java.io.InputStreamReader;

 
public class InputStreamReaderExample {
    
    public static void main(String[] args) {
        
        try(InputStreamReader reader = new InputStreamReader(System.in)){
            System.out.println("Enter characters, press enter to finish:");
            
            int data;
            
            while((data=reader.read()) != '\n'){
                System.out.print((char)data);
            }
            
        }catch(IOException e){
            System.out.println("Error : "+e.getMessage());
        }
        
    }
}
