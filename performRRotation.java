import java.util.*;
public class performRRotation {
	public static void reverse(int [] a, int l, int h){
        while(l<h){
          int temp=a[l];
           a[l]=a[h];
           a[h]=temp;
           l++;
           h--;
        }
        //return a;
  }
   public static  void rotate(int [] a, int r){
        reverse(a, 0, r-1);
        reverse(a, r, a.length-1);
        reverse(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]a= {1,2,3,4,5,6};
        rotate(a,3);
	}

}
