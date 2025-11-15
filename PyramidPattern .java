public class PyramidPattern {
    public static void main(String[] args) {
        int n = 5; // height

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


output
    *
   ***
  *****
 *******
*********
