
public class LargestElement {
	 public static void max(int[] a){
	        int max=a[0];
	        for(int i=2;i<a.length;i++){
	            if(a[i]>max){
	                max=a[i];
	            }
	        }
	        System.out.println("largest element of array: "+max);
	 }
	 
	 public static void main(String[] args) {
	        int[] a=new int[]{1,5,7,3,8,8,2};
	        max(a);
	       
	 }
}
