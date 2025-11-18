public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 88, 73, 90};
        System.out.println("Assignment scores: " + java.util.Arrays.toString(scores));
        
        insertionSort(scores);
        
        System.out.println("Sorted scores: " + java.util.Arrays.toString(scores));
    }
}

Output:
Assignment scores: [85, 92, 78, 96, 88, 73, 90]
Sorted scores: [73, 78, 85, 88, 90, 92, 96]
