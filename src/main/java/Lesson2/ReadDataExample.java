 
package Lesson2;
 
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadDataExample {
    public static void main(String[] args) {
        
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("example.dat"))){
            dos.writeInt(43);
            dos.writeDouble(3.14);
            dos.writeUTF("Hello, data streams!");
            System.out.println("Data written sucessfully!");    
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Error : "+e.getMessage());
        }
        
        
        try(DataInputStream dis = new DataInputStream(new FileInputStream("example.dat"))){
            int number = dis.readInt(); 
            double pi = dis.readDouble();
            String message = dis.readUTF();
            System.out.println("Number : "+number);
            System.out.println("Pi : "+pi); 
            System.out.println("Message: "+message); 
            
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Error : "+e.getMessage());
        }
        
    }
}
