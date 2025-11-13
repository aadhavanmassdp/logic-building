```java
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] years = {2005, 1998, 2012, 2001, 2009, 1995, 2003};
        System.out.println("Publication years: " + java.util.Arrays.toString(years));
        
        selectionSort(years);
        
        System.out.println("Sorted years: " + java.util.Arrays.toString(years));
    }
}
```

**Output:**
```
Publication years: [2005, 1998, 2012, 2001, 2009, 1995, 2003]
Sorted years: [1995, 1998, 2001, 2003, 2005, 2009, 2012]
```

**Result:** Books arranged chronologically from oldest to newest in O(n²) time.

