# 12 Sorting Algorithms with Scenarios, Code, and Results

## 1. Bubble Sort

**Scenario:** A small classroom wants to arrange students by height for a group photo. The teacher uses bubble sort to compare adjacent students and swap them if they're in the wrong order.

```java
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
```

**Output:**
```
Original heights: [165, 158, 172, 150, 168, 155, 170]
Sorted heights: [150, 155, 158, 165, 168, 170, 172]
```

**Result:** Students arranged from shortest to tallest in O(n²) time.

---

## 2. Selection Sort

**Scenario:** A library wants to organize books by publication year, always selecting the oldest book from the remaining unsorted books.

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

---

## 3. Insertion Sort

**Scenario:** A student is organizing their assignment scores as they receive them, inserting each new score in the correct position.

```java
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
```

**Output:**
```
Assignment scores: [85, 92, 78, 96, 88, 73, 90]
Sorted scores: [73, 78, 85, 88, 90, 92, 96]
```

**Result:** Scores arranged from lowest to highest in O(n²) time, efficient for small datasets.

---

## 4. Merge Sort

**Scenario:** A company needs to merge two sorted lists of employee IDs from different departments into one sorted list.

```java
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            
            merge(arr, left, mid, right);
        }
    }
    
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];
        
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    
    public static void main(String[] args) {
        int[] employeeIds = {105, 102, 108, 101, 107, 103, 109, 104, 106};
        System.out.println("Employee IDs: " + java.util.Arrays.toString(employeeIds));
        
        mergeSort(employeeIds, 0, employeeIds.length - 1);
        
        System.out.println("Sorted IDs: " + java.util.Arrays.toString(employeeIds));
    }
}
```

**Output:**
```
Employee IDs: [105, 102, 108, 101, 107, 103, 109, 104, 106]
Sorted IDs: [101, 102, 103, 104, 105, 106, 107, 108, 109]
```

**Result:** Employee IDs sorted in O(n log n) time with stable sorting.

---

## 5. Quick Sort

**Scenario:** A restaurant wants to quickly arrange orders by preparation time, using a pivot to partition orders into faster and slower preparation times.

```java
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
    
    public static void main(String[] args) {
        int[] prepTimes = {15, 8, 22, 5, 18, 12, 25, 10};
        System.out.println("Preparation times: " + java.util.Arrays.toString(prepTimes));
        
        quickSort(prepTimes, 0, prepTimes.length - 1);
        
        System.out.println("Sorted times: " + java.util.Arrays.toString(prepTimes));
    }
}
```

**Output:**
```
Preparation times: [15, 8, 22, 5, 18, 12, 25, 10]
Sorted times: [5, 8, 10, 12, 15, 18, 22, 25]
```

**Result:** Orders arranged by preparation time in average O(n log n) time.

---

## 6. Heap Sort

**Scenario:** A priority queue system for emergency room patients needs to sort patients by severity of condition using a max heap.

```java
public class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;
        
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        
        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            heapify(arr, i, 0);
        }
    }
    
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        if (left < n && arr[left] > arr[largest])
            largest = left;
        
        if (right < n && arr[right] > arr[largest])
            largest = right;
        
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            
            heapify(arr, n, largest);
        }
    }
    
    public static void main(String[] args) {
        int[] severity = {3, 7, 1, 9, 4, 6, 2, 8, 5};
        System.out.println("Patient severity (1-10): " + java.util.Arrays.toString(severity));
        
        heapSort(severity);
        
        System.out.println("Sorted by severity: " + java.util.Arrays.toString(severity));
    }
}
```

**Output:**
```
Patient severity (1-10): [3, 7, 1, 9, 4, 6, 2, 8, 5]
Sorted by severity: [1, 2, 3, 4, 5, 6, 7, 8, 9]
```

**Result:** Patients sorted by severity level in O(n log n) time with O(1) space complexity.

---

## 7. Counting Sort

**Scenario:** A school grades students with letter grades A, B, C, D, F and wants to count and sort these grades efficiently.

```java
public class CountingSort {
    public static void countingSort(int[] arr) {
        if (arr.length == 0) return;
        
        // Find the maximum and minimum values
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];
        
        // Store count of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        
        // Change count[i] so that count[i] contains actual position
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        
        // Build the output array
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        
        // Copy the output array to arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
    
    public static void main(String[] args) {
        int[] grades = {85, 92, 78, 96, 88, 73, 90, 85, 92, 78}; // Simulated scores
        System.out.println("Student scores: " + java.util.Arrays.toString(grades));
        
        countingSort(grades);
        
        System.out.println("Sorted scores: " + java.util.Arrays.toString(grades));
    }
}
```

**Output:**
```
Student scores: [85, 92, 78, 96, 88, 73, 90, 85, 92, 78]
Sorted scores: [73, 78, 78, 85, 85, 88, 90, 92, 92, 96]
```

**Result:** Student scores sorted efficiently in O(n + k) time where k is the range of input.

---

## 8. Radix Sort

**Scenario:** A postal service needs to sort packages by ZIP codes, processing digits from least significant to most significant.

```java
public class RadixSort {
    public static void radixSort(int[] arr) {
        int max = getMax(arr);
        
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }
    
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    
    private static void countingSortByDigit(int[] arr, int exp) {
        int[] output = new int[arr.length];
        int[] count = new int[10];
        
        // Count occurrences of each digit
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        
        // Change count[i] to actual position
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        
        // Build output array
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        
        // Copy output array to arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
    
    public static void main(String[] args) {
        int[] zipCodes = {12345, 54321, 98765, 23456, 65432, 11111, 99999, 55555};
        System.out.println("ZIP codes: " + java.util.Arrays.toString(zipCodes));
        
        radixSort(zipCodes);
        
        System.out.println("Sorted ZIP codes: " + java.util.Arrays.toString(zipCodes));
    }
}
```

**Output:**
```
ZIP codes: [12345, 54321, 98765, 23456, 65432, 11111, 99999, 55555]
Sorted ZIP codes: [11111, 12345, 23456, 54321, 55555, 65432, 98765, 99999]
```

**Result:** ZIP codes sorted efficiently in O(d × (n + k)) time where d is number of digits.

---

## 9. Bucket Sort

**Scenario:** A university wants to sort student GPAs into letter grade categories (buckets) for analysis.

```java
import java.util.*;

public class BucketSort {
    public static void bucketSort(float[] arr) {
        if (arr.length <= 1) return;
        
        int n = arr.length;
        @SuppressWarnings("unchecked")
        List<Float>[] buckets = new List[n];
        
        // Initialize buckets
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }
        
        // Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (arr[i] * n);
            if (bucketIndex >= n) bucketIndex = n - 1;
            buckets[bucketIndex].add(arr[i]);
        }
        
        // Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
        
        // Concatenate all buckets into arr
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }
    
    public static void main(String[] args) {
        float[] gpas = {3.7f, 2.8f, 3.9f, 2.1f, 3.5f, 3.2f, 2.9f, 3.8f, 2.6f, 3.4f};
        System.out.println("Student GPAs: " + Arrays.toString(gpas));
        
        bucketSort(gpas);
        
        System.out.println("Sorted GPAs: " + Arrays.toString(gpas));
    }
}
```

**Output:**
```
Student GPAs: [3.7, 2.8, 3.9, 2.1, 3.5, 3.2, 2.9, 3.8, 2.6, 3.4]
Sorted GPAs: [2.1, 2.6, 2.8, 2.9, 3.2, 3.4, 3.5, 3.7, 3.8, 3.9]
```

**Result:** GPAs sorted efficiently in O(n + k) average time when uniformly distributed.

---

## 10. Shell Sort

**Scenario:** A music app wants to partially sort a playlist by play count, allowing users to see popular songs while maintaining some original order.

```java
public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        
        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                
                // Shift earlier gap-sorted elements up until the correct location for arr[i] is found
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                
                // Put temp in its correct location
                arr[j] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] playCounts = {45, 23, 78, 12, 89, 34, 67, 56, 91, 28};
        System.out.println("Song play counts: " + java.util.Arrays.toString(playCounts));
        
        shellSort(playCounts);
        
        System.out.println("Sorted play counts: " + java.util.Arrays.toString(playCounts));
    }
}
```

**Output:**
```
Song play counts: [45, 23, 78, 12, 89, 34, 67, 56, 91, 28]
Sorted play counts: [12, 23, 28, 34, 45, 56, 67, 78, 89, 91]
```

**Result:** Play counts sorted with improved insertion sort in O(n^1.3) average time.

---

## 11. Tim Sort

**Scenario:** A social media platform needs to efficiently sort posts by engagement while maintaining relative order of posts with similar engagement.

```java
import java.util.Arrays;

public class TimSort {
    private static final int RUN = 32;
    
    public static void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    
    public static void merge(int[] arr, int l, int m, int r) {
        int len1 = m - l + 1, len2 = r - m;
        int[] left = new int[len1];
        int[] right = new int[len2];
        
        for (int x = 0; x < len1; x++) {
            left[x] = arr[l + x];
        }
        for (int x = 0; x < len2; x++) {
            right[x] = arr[m + 1 + x];
        }
        
        int i = 0, j = 0, k = l;
        
        while (i < len1 && j < len2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        while (i < len1) {
            arr[k] = left[i];
            k++;
            i++;
        }
        
        while (j < len2) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }
    
    public static void timSort(int[] arr, int n) {
        // Sort individual subarrays of size RUN
        for (int i = 0; i < n; i += RUN) {
            insertionSort(arr, i, Math.min((i + RUN - 1), (n - 1)));
        }
        
        // Start merging from size RUN (or 32)
        for (int size = RUN; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (n - 1));
                
                if (mid < right) {
                    merge(arr, left, mid, right);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] engagement = {1250, 890, 2100, 450, 1800, 750, 3200, 1100, 1650, 980};
        System.out.println("Post engagement: " + Arrays.toString(engagement));
        
        timSort(engagement, engagement.length);
        
        System.out.println("Sorted by engagement: " + Arrays.toString(engagement));
    }
}
```

**Output:**
```
Post engagement: [1250, 890, 2100, 450, 1800, 750, 3200, 1100, 1650, 980]
Sorted by engagement: [450, 750, 890, 980, 1100, 1250, 1650, 1800, 2100, 3200]
```

**Result:** Posts sorted by engagement with stable sorting in O(n log n) time.

---

## 12. Comb Sort

**Scenario:** A fitness app wants to sort workout durations with improved efficiency over bubble sort by using a gap that decreases over time.

```java
public class CombSort {
    public static void combSort(int[] arr) {
        int n = arr.length;
        int gap = n;
        boolean swapped = true;
        
        while (gap != 1 || swapped) {
            gap = getNextGap(gap);
            swapped = false;
            
            for (int i = 0; i < n - gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    swapped = true;
                }
            }
        }
    }
    
    private static int getNextGap(int gap) {
        gap = (gap * 10) / 13;
        if (gap < 1) return 1;
        return gap;
    }
    
    public static void main(String[] args) {
        int[] workoutMinutes = {45, 30, 60, 25, 50, 35, 40, 55, 20, 48};
        System.out.println("Workout durations: " + java.util.Arrays.toString(workoutMinutes));
        
        combSort(workoutMinutes);
        
        System.out.println("Sorted durations: " + java.util.Arrays.toString(workoutMinutes));
    }
}
```

**Output:**
```
Workout durations: [45, 30, 60, 25, 50, 35, 40, 55, 20, 48]
Sorted durations: [20, 25, 30, 35, 40, 45, 48, 50, 55, 60]
```

**Result:** Workout durations sorted efficiently with improved bubble sort in O(n²) worst case but often better in practice.

---

## Summary Table

| Algorithm | Time Complexity | Space Complexity | Best Use Case |
|-----------|----------------|------------------|---------------|
| Bubble Sort | O(n²) | O(1) | Small datasets, educational |
| Selection Sort | O(n²) | O(1) | Small datasets, minimal swaps |
| Insertion Sort | O(n²) | O(1) | Small/nearly sorted data |
| Merge Sort | O(n log n) | O(n) | Stable sorting needed |
| Quick Sort | O(n log n) avg | O(log n) | General purpose |
| Heap Sort | O(n log n) | O(1) | Memory constrained |
| Counting Sort | O(n + k) | O(k) | Limited range integers |
| Radix Sort | O(d × (n + k)) | O(n + k) | Fixed-length keys |
| Bucket Sort | O(n + k) avg | O(n) | Uniformly distributed |
| Shell Sort | O(n^1.3) avg | O(1) | Medium datasets |
| Tim Sort | O(n log n) | O(n) | Real-world data |
| Comb Sort | O(n²) worst | O(1) | Improved bubble sort |
