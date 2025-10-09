public class CountDigits {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;

        while (num != 0) {
            num /= 10;   // Remove the last digit
            count++;     // Increase count
        }

        System.out.println("Total digits: " + count);
    }
}
//Total digits: 5
