import java.util.Arrays;

public class linearAndBinarySearch {
	public static int binarySearch(int[] a,int key,int low, int high){
        
        int mid =(low+high)/2;
        if(low>high){
            return -1;
        }
        if(key==a[mid]){
            return mid;
        }
        else if(key<a[mid]){
            return binarySearch(a, key, low, mid-1);
        }
        else{
            return binarySearch(a, key, mid+1, high);
        }
    }
	public static int linearSearch(int[] a, int key) {
		for(int i=0;i<a.length;i++){
			if(a[i]==key) {
				return  i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{1,5,7,7,3,8,8,2};
		Arrays.sort(a);
		System.out.println(binarySearch( a,5,0, 7));
		System.out.println(linearSearch(a, 5));
		
	}


}
