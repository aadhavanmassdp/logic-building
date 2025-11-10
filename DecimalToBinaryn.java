import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        int original = num;
        String binary = "";

        if (num == 0) {
            binary = "0";
        } else {
            while (num > 0) {
                int remainder = num % 2;
                binary = remainder + binary;
                num /= 2;
            }
        }

        System.out.println("Decimal: " + original);
        System.out.println("Binary: " + binary);

        sc.close();
    }
}


Output:

Enter a decimal number: 25
Decimal: 25
Binary: 11001
