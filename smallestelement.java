
public class SmallestElement {
    public static int findSmallest(int[] arr) {
        int min = arr[0]; // assume first element is smallest
        for (int n : arr) {
            if (n < min) min = n; // update if smaller element found
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        System.out.println("Smallest element: " + findSmallest(arr));
    }
}
