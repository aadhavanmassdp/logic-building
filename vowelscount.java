public class CountVowels {
    public static void main(String[] args) {
        String s = "hello world";
        int count = 0;           

        for (char c : s.toCharArray()) {
              if ("aeiouAEIOU".indexOf(c) != -1) {
                count++; // Increment counter if vowel found
            }
        }

         System.out.println("Number of vowels: " + count);
    }
}
