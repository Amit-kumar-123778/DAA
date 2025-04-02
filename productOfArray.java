import java.util.*;
public class productOfArray {
	  public static void productExceptSelf(int[] nums) {
	        int n = nums.length;
	        int[] result = new int[n];
	        result[0] = 1;  
	        for (int i = 1; i < n; i++) {
	            result[i] = result[i - 1] * nums[i - 1];
	        }
	        int rightProduct = 1;
	        for (int i = n - 1; i >= 0; i--) {
	            result[i] *= rightProduct;  
	            rightProduct *= nums[i]; 
	        }
	        System.out.println(Arrays.toString(result));
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a =  new int[]{1, 2, 3, 4};
		 productExceptSelf(a);
	}

}
