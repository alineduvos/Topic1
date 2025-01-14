 
package Lesson2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

 
public class BufferedInputExample {
    
    public static void main(String[] args) {
        
        String filePath = "example.txt";
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))){
           
            int data;
            while((data=bis.read())!=-1){
                System.out.print((char)data);
            }
            
        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
        
    }
}
