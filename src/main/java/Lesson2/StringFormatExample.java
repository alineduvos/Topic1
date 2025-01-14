 
package Lesson2;

 
public class StringFormatExample {
    public static void main(String[] args) {
        
        String name = "Bruce Wayne";
        int age = 24;
        
        /*
             %s = placeholder for a string
             %d = placeholder for an integer 
        
        */
        String formatted = String.format("Name: %s, Age: %d ", name,age);
        System.out.println(formatted);
        
        
        /*
            %.2f - formats a number to 2 decimal places
            %.0f - formats a number with 0 decimal places
            %% - escapes the % to print it
        
        */
        
        double price = 19.99;
        double discount = 15; // want to show as 15% 
        String ffNumbers = String.format("Price: R%.2f, Discount: %.0f%%", price, discount);
        System.out.println(ffNumbers);
        
        // Aligning text and numbers
        /*
            %10s - right aligns a string (10 characters) 
            %-10s - left aligns a string (10 characters)
        
        */
        System.out.println(String.format("%-10s %10s", "Item", "Price"));
        System.out.println(String.format("%-10s %10s", "Book", 12.99));
        System.out.println(String.format("%-10s %10s", "Pen", 1.99));
    }
    
    
}
