import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0, digits = 0;

        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                digits++;
            } else if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
    }
}


output:
Enter a string: Adv123
Vowels: 1
Consonants: 2
Digits: 3

