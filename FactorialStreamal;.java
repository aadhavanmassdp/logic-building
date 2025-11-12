Solution:
import java.util.stream.IntStream;

public class FactorialStream {
    public static void main(String[] args) {
        int n = 6;
        long fact = IntStream.rangeClosed(1, n)
                             .reduce(1, (a, b) -> a * b);
        System.out.println("Factorial of " + n + " = " + fact);
    }
}



Output:
Factorial of 6 = 720
