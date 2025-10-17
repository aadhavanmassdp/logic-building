public class ReverseStringExample {
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String result = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + result);
    }
}
//outputOriginal String: hello
//Reversed String: olleh
