import java.util.*;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};  // You can change values to test other cases

        boolean sorted = true;  // Assume array is sorted

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {  // If any element is greater than next one
                sorted = false;
                break;  // No need to check further
            }
        }

        // Print result using ternary operator
        System.out.println(sorted ? "Sorted" : "Not Sorted");
    }
}
//Out put:
//Sorted
