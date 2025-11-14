
import java.util.*;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        int temp = n;

        while (temp > 0) {
            temp = temp & (temp - 1);
            count++;
        }

        System.out.println("Total set bits in " + n + " = " + count);
    }
}



output:
Enter a number: 13
Total set bits in 13 = 3

