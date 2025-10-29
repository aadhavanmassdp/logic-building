import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

          int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }

              int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum using Loop: " + sumLoop);
        System.out.println("Sum using Formula: " + sumFormula);

        sc.close();
    }
}


//Output;
//Enter a number: 10
//Sum using Loop: 55
//Sum using Formula: 55

