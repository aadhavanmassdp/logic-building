public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121, original = num, reversed = 0;

        while (num != 0) {
            reversed = reversed * 10 + num % 10; // Reverse logic
            num /= 10;
        }

        if (original == reversed)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
