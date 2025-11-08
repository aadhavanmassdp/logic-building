public class TransposeMatrix {
    public static void main(String[] args) {
        int rows = 2, cols = 3;
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] transpose = new int[cols][rows];

        // Transpose logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display result
        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose Matrix:");
        for (int[] row : transpose) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}


/*Output:

Original Matrix:
1 2 3 
4 5 6 

Transpose Matrix:
1 4 
2 5 
3 6*/ 
