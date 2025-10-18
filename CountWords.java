public class CountWords {
    public static void main(String[] args) {
        String s = "Java is fun"; // Input string
        
        // Split the string by one or more spaces using regex "\\s+"
        String[] words = s.split("\\s+");
        
        // Count the number of words
        int count = words.length;
        
        // Display result
        System.out.println("Sentence: " + s);
        System.out.println("Number of words: " + count);
    }
}
//output
//Sentence: Java is fun
//Number of words: 3
