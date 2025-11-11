import java.util.Scanner;

public class DecimalToOctHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String octal = Integer.toOctalString(decimal);
        String hex = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Octal equivalent: " + octal);
        System.out.println("Hexadecimal equivalent: " + hex);
    }
}



//Output:
//Enter a decimal number: 255
//Octal equivalent: 377
//Hexadecimal equivalent: FF


