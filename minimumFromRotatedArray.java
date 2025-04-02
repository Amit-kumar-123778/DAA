import java.util.Arrays;

public class minimumFromRotatedArray {
	 public static int findMin(int[] a) {
	        int left = 0, right = a.length - 1;

	        while (left < right) {
	            int mid = (left + right) / 2;
	            if (a[mid] > a[right]) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return a[left]; 
	}
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] a=new int[]{3,4,5,1,2};
			System.out.println(findMin(a));
			
	}

}
