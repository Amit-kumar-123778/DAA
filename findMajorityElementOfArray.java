
public class findMajorityElementOfArray {
	 public static int majorityElement(int[] a) {
	        int result = 0, count = 0;
	        for (int num : a) {
	            if (count == 0) {
	                result = num;
	            }
	            count += (num == result) ? 1 : -1;
	        }

	        return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{2, 2, 1, 1, 1, 2, 2};
		System.out.println(majorityElement(a));
	}

}
