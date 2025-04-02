
public class secondLargestElementOfArray {
	 public static void max(int[] a){
	        int max2=a[0];
	        int max1=a[1];
	        for(int i=2;i<a.length;i++){
	            if(a[i]>max1){
	                max2=max1;
	                max1=a[i];
	            }
	        }
	        System.out.println("1st Largest: "+max1+" 2nd Largest: "+max2);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a=new int[]{1,5,7,3,8,8,2};
	        int n=a.length;
	        max(a);
	}

}
