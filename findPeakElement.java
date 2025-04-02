
public class findPeakElement {
	 public static void peek(int[] a){
	       int i=1;
	       int c=0;
	       if(a.length==1){
	          System.out.println(a[0]);
	          return;
	       }
	       if(a.length==2){
	           if(a[0]>a[1]){
	              System.out.println(a[0]);
	              return;
	           }
	           System.out.println(a[1]);
	           return;
	       }
	       while(i<a.length-2){
	        if(a[i]>a[i-1] && a[i]>a[i+1]){
	            System.out.println(a[i]);
	            c++;
	        }
	        i++;
	       }
	       if(c==0){
	          System.out.println(a[i+1]);
	       }
	    }
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] a=new int[]{3,4,5,1,2};
			peek(a);
			
	}
}
