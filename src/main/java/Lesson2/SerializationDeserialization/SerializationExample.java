 
package Lesson2.SerializationDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

class Student implements Serializable{
    
    // For versioning serialized data 
    private static final long serialVersionUID = 1L;
    
    private String name;
    private int age;
    private String course;
    
    public Student(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }
    
    @Override
    public String toString(){
        return "Student{name = '"+name+"', age = "+age+", course = '"+course+"'}";
    }
}


 
public class SerializationExample {
    public static void main(String[] args) {
        
        // This our object to serialize
        Student student = new Student("Bruce Wayne", 24, "Computer Science");
        
         FileOutputStream fos = null;
         ObjectOutputStream oos = null;
        try{    
            // Writes to a file "student.ser"
            fos = new FileOutputStream("student.ser");
            
            // Convert the object into a byte stream
            oos = new ObjectOutputStream(fos);
            
            // Serialize the object
            oos.writeObject(student);
            
            System.out.println("Serialization complete : Object saved to student.ser");

            
        }catch (IOException e){
            System.out.println("Error during Serialization : "+e.getMessage());
        }finally{
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                 System.out.println("Error when closing streams : "+e.getMessage());
            }
        }
        
    }
}
