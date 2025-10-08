public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1234, sum = 0;

        while (num != 0) {
            sum += num % 10;  // Add last digit
            num /= 10;        // Remove last digit
        }

        System.out.println("Sum of digits: " + sum);
    }
}
