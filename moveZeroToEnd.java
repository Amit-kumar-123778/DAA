import java.util.Arrays;

public class moveZeroToEnd {
    public static void moveZeroToEnd(int[] a) {
    	int[] b= new int[a.length];
    	int k=0;
    	for(int i=0;i<a.length;i++) {
    		if(a[i]!=0)
    			b[k++]=a[i];
    	}
    	while(k<a.length)
    			b[k++]=0;
    	System.out.println(Arrays.toString(b));
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{0,5,0,7,3,0,8,2};
		moveZeroToEnd( a);
	}

}
