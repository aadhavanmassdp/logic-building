import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Sum of even numbers between 1 and " + n + " = " + sum);
    }
}


//Output

//Enter N: 10
//Sum of even numbers between 1 and 10 = 30
