import java.util.*;
public class merge2ArrayInAscending {
	 public static void mergeArray(int[] a,int[] b){
	        int[] c=new int[a.length+b.length];
	        int i=0;
	        int j=0;
	        int k=0;
	        while(i<a.length && j<b.length){
	            if(a[i]<b[j]){
	               c[k++]=a[i++];
	            }
	            else{
	                c[k++]=b[j++];
	            }
	        }
	        while(i<a.length){
	            c[k++]=a[i++];
	        }
	        while(j<b.length){
	            c[k++]=b[j++];
	        }
	        System.out.println(Arrays.toString(c));
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4};
        int []b={3,5,6};
        mergeArray(a, b);
        
	}

}
