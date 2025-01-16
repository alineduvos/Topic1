 
package Lesson3;

import java.io.*;

 
public class CombinedExample {
    
    public static void main(String[] args) {
        
        try(
            BufferedReader reader = new BufferedReader(new FileReader("myfile1.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("myfile2.txt"));
        ){

            // read the file 
            String line;
            while((line=reader.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }
            
            // adding numbers to the file
            for(int x=1; x<=10; x++){
                writer.write("index = "+x+"\n");
            }

            
        }catch (IOException e){
            System.out.println("Error :"+e.getMessage());
        }
        
    }
}
