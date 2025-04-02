
public class RotateMatrix90Degree {
	 public static int[][] rotate(int[][] a){
	        int[][] b=new int[a[0].length][a[1].length];
	        for(int  i=0; i<a[0].length;i++){
	            int j=a[1].length-1;
	            int k=0;
	            while(j>=0){
	                b[i][k++]=a[j][i];
	                j--;
	            }
	        }
	       return b;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1, 2, 3},{4, 5, 6},{7,8,9}};
		matrix=rotate(matrix);
		 for (int i = 0; i < matrix[0].length; i++) {
	            for (int j = 0; j < matrix[0].length; j++) {
	                System.out.print(matrix[i][j]+" ");
	            }
	            System.out.println();
	     }
	}

}
