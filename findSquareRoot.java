
public class findSquareRoot {
	 public static int Sqrt(int num) {
	        if (num == 0 || num == 1) 
	        	return num;

	        int left = 1, right = num;
	        int result = 0;

	        while (left <= right) {
	            int mid = left + (right - left) / 2; 

	            if (mid <= num / mid) {
	                result = mid; 
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        
	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Sqrt(36));
	}
}
