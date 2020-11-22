import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Speller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        MyHashSet hashSet = new MyHashSet();
        
        // Step 1: load our txt file of English words.
        try {
            BufferedReader rd = new BufferedReader(new FileReader("words.txt"));
            
            String currentLine = null;
            while ((currentLine = rd.readLine()) != null) {
                hashSet.add(currentLine);
            }
        } catch (IOException e) {
            System.out.println("Exception loading words.txt.");
        }
        
        // Step 2: read the sentence given into an array of strings
        String[] sentenceWords;
        String input = sc.nextLine();
        if (input.equals("")) {
            sentenceWords = new String[0];
        } else {    
            sentenceWords = input.split(" ");
        }
        
        // Step 3: print all misspelled words
        for (String word : sentenceWords) {
            if (!hashSet.contains(word)) {
                System.out.println(word);
            }
        }
    }
}