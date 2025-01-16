
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

 
public class WordFrequencyCounter {
   
    private final static String INPUT_PATH = "wordsInput.txt";
    private final static String OUTPUT_PATH = "wordsCounted.txt";
    
    public static void main(String[] args) {
          
       try{
            saveWordCountToFile(countWordFrequency(INPUT_PATH), OUTPUT_PATH);
            System.out.println("Words counted successfully!");
            System.out.println("Word count written to file successfully!");
            
       }catch (IOException e){
           System.out.println("Error :"+e.getMessage());
       }
    }
    
    private static Map<String, Integer> countWordFrequency(String filePath) throws IOException{
        
       Map<String, Integer> wordFrequenceMap = new HashMap<>();
        
       try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
           String line;
           while((line=reader.readLine()) !=null){
              
               // splitting the line into words using split method and regex
               String words [] = line.toLowerCase().split("\\W+");
               
               // adding words to hash map
                 
               for(String word:words){
                   // wordFrequenceMap.get(word) - getting the value using the key
                   // (wordFrequenceMap.getOrDefault("reader", 0) )+1
                   wordFrequenceMap.put(word, wordFrequenceMap.getOrDefault(word, 0)+1);
               }
               
           }
       } 
       
       
       return wordFrequenceMap;
    }
    
    private static void saveWordCountToFile(Map<String, Integer> words, String filePath) throws IOException{
        try(PrintWriter writer = new PrintWriter(filePath)){
            for(Map.Entry<String, Integer> word : words.entrySet()){
                writer.println(word.getKey() + " : "+word.getValue());
            }
        }
    }
    
    
    
    
    
}
