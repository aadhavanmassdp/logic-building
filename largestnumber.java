public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
        int max = arr[0];

        for (int n : arr) {
            if (n > max)
                max = n;
        }

        System.out.println("Largest element: " + max);
    }
}

//Largest element: 8
