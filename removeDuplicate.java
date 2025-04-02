import java.util.*;

public class removeDuplicate {
	 public static void removeDuplicate(int[] a){
	        List<Integer> b=new ArrayList<>();
	        for(int n:a){
	            if(!b.contains(n)){
	                b.add(n);
	            }
	        }
	        a=new int[b.size()];
	        int i=0;
	        for(int m:b){
	            a[i++]=m;
	        }
	        System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{1,5,7,7,3,8,8,2};
		removeDuplicate(a);
	}

}
