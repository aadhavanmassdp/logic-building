import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        sc.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) { // 0 and 1 are not prime
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // check up to √n
            if (n % i == 0) {
                return false; // divisible by a number other than 1 and itself
            }
        }
        return true;
    }
}
