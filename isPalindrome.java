public class PalindromeStringExample {
   
    public static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public static void main(String[] args) {
        String input = "madam"; 
        boolean result = isPalindrome(input);

        System.out.println("Original String: " + input);
        if (result)
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is NOT a Palindrome");
    }
}
//Input: 
//madam
 
//Out put
//Original String: madam
//It is a Palindrome

