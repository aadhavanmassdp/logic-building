
import java.util.*;

public class CharFrequencyMethod {

    // Method to calculate character frequency
    public static Map<Character, Integer> charFrequency(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        String s = "apple";  // Input string
        Map<Character, Integer> result = charFrequency(s);

        System.out.println("Character Frequency in: " + s);
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}



//Output :
//Character Frequency in: apple
//a -> 1
//p -> 2
//l -> 1
//e -> 1
