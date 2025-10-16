import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

   
        Set<Integer> set = new LinkedHashSet<>();
        for (int n : arr) set.add(n);


        int[] unique = new int[set.size()];
        int i = 0;
        for (int n : set) unique[i++] = n;

       
        System.out.println("Array without duplicates: " + Arrays.toString(unique));
    }
}
//output : [1, 2, 3, 4, 5]
