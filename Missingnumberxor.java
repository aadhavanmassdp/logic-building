import java.util.Scanner;

public class MissingNumberSumMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        System.out.println("Enter " + (N - 1) + " numbers:");
        long sum = 0;

        for (int i = 0; i < N - 1; i++) {
            sum += sc.nextInt();
        }

        long expected = (long) N * (N + 1) / 2;
        long missing = expected - sum;

        System.out.println("Missing number is: " + missing);
    }
}


Output:

Enter N: 5
Enter 4 numbers:
1 2 4 5
Missing number is: 3

type 2
    import java.util.Scanner;

public class MissingNumberXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        System.out.println("Enter " + (N - 1) + " numbers:");
        int xorAll = 0;
        int xorArr = 0;

        for (int i = 1; i <= N; i++) {
            xorAll ^= i;
        }

        for (int i = 0; i < N - 1; i++) {
            xorArr ^= sc.nextInt();
        }

        int missing = xorAll ^ xorArr;
        System.out.println("Missing number is: " + missing);
    }
}

/*Enter N: 5
Enter 4 numbers:
1 2 4 5
Missing number is: 3*/
