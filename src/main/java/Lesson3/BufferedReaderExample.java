 
package Lesson3;

import java.io.*; 

 
public class BufferedReaderExample {
    public static void main(String[] args) {
         
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            
            System.out.println("Enter text (type 'exit' to quit):");
            
            String line;
            while(!(line=reader.readLine()).equalsIgnoreCase("exit")){
                // keep on processing...
                System.out.println("You typed : "+line);
            }
              
        }catch(IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
