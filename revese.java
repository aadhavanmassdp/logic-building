import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num; // store original number
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;        // extract last digit
            reversed = reversed * 10 + digit; // append digit
            num /= 10;                    // remove last digit
        }

        System.out.println("Reversed number of " + originalNum + " is " + reversed);
        sc.close();
    }
}
