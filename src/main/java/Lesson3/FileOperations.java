 
package Lesson3;

import java.io.File;
import java.io.IOException;

 
public class FileOperations {
    
    public static void main(String[] args) {
        
        String filePath = "MyFile.txt";
        File myFile = new File(filePath);
        
        // Check if the file exists
        System.out.println("File exists? "+myFile.exists());
        
        try{
            
            boolean isCreated = myFile.createNewFile();
            
            if(isCreated){
                System.out.println("File successfully created!");
            }else{
                System.out.println("File already exists!");
            }
            
            // Get file details
            System.out.println("File name : "+myFile.getName());
            System.out.println("Absolute path: "+myFile.getAbsolutePath());
            
            // Rename the file
            File renamedFile = new File("RenamedFile.txt");
            boolean isRenamed = myFile.renameTo(renamedFile);
            System.out.println("File renamed : "+isRenamed);
            
            // Delete a file
            boolean isDeleted = renamedFile.delete();
            System.out.println("File deleted : "+isDeleted);
            
        }catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
        
    }
}
