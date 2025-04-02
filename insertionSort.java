import java.util.Arrays;

public class insertionSort {
	 public static void insertionSort(int [] a){
	        for(int j=1;j<a.length;j++){
	            int key=a[j];
	            int i=j-1;
	            while(i>=0 && a[i]>key){
	                a[i+1]=a[i];
	                i--;
	            }
	            a[i+1]=key;
	        }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{1,5,7,3,8,8,2};
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
