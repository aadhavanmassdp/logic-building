
public class RemoveSpaces {
    public static void main(String[] args) {
        // Input string
        String s = "Java is fun to learn";

        // Remove all spaces using replaceAll()
        String noSpaces = s.replaceAll("\\s", "");

        // Display results
        System.out.println("Original String: " + s);
        System.out.println("String without spaces: " + noSpaces);
    }
}

Output:
Original String: Java is fun to learn
String without spaces: Javaisfuntolearn
