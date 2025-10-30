
public class CountPosNegZero {
    public static void main(String[] args) {
        int[] arr = {1, -3, 0, 7, -5, 9, 0, -2};

        int positive = 0, negative = 0, zeros = 0;

        for (int num : arr) {
            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
            else
                zeros++;
        }

        System.out.println("Positive Numbers: " + positive);
        System.out.println("Negative Numbers: " + negative);
        System.out.println("Zeros: " + zeros);
    }
}
