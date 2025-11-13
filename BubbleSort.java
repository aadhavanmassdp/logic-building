public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization: if no swaps, array is sorted
        }
    }
    
    public static void main(String[] args) {
        int[] heights = {165, 158, 172, 150, 168, 155, 170};
        System.out.println("Original heights: " + java.util.Arrays.toString(heights));
        
        bubbleSort(heights);
        
        System.out.println("Sorted heights: " + java.util.Arrays.toString(heights));
    }
}

**Output:**

Original heights: [165, 158, 172, 150, 168, 155, 170]
Sorted heights: [150, 155, 158, 165, 168, 170, 172]


**Result:** Students arranged from shortest to tallest in O(n²) time.
