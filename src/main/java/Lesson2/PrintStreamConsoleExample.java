 
package Lesson2;

import java.io.PrintStream;

 
public class PrintStreamConsoleExample {
    
    public static void main(String[] args) {
        
        // Writing to a console
        PrintStream ps = System.out;
        ps.print("Hello!");
        ps.println("There!");
        ps.printf("This is a number %d which represents my age  ", 24);
    }
}
