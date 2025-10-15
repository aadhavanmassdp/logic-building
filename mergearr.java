public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] merged = new int[arr1.length + arr2.length];

        // Copy first array
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        // Copy second array
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

        // Print merged array
        System.out.print("Merged Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}

//Output Merged Array: 1 2 3 4
