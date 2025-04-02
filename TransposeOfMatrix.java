import java.util.Arrays;

public class TransposeOfMatrix {
	public static void transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(transposed[i][j]+" ");
            }
            System.out.println();
            
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1, 2, 3},{4, 5, 6},{7,8,9}};
		transpose(matrix);
		

	}

}
