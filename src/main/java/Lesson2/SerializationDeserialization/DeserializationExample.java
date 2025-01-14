 
package Lesson2.SerializationDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

 
public class DeserializationExample {
    public static void main(String[] args) {
        
        // Deserialize the object 
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))){
            
            Student deseraializedStudent = (Student) ois.readObject();
            
            System.out.println("Deserialization complete!"+deseraializedStudent);
            
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error : "+e.getMessage());
        }
        
    }
}
