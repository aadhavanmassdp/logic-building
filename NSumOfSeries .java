import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Invalid N");
            return;
        }

        double sum = 0.0;
        for (int i = 1; i <= N; i++) {
            sum += 1.0 / i;
        }

        System.out.printf("Sum of series 1 + 1/2 + ... + 1/%d = %.12f\n", N, sum);
    }
}


Output:

Enter N: 5
Sum of series 1 + 1/2 + ... + 1/5 = 2.283333333333
