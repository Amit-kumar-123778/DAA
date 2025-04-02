import java.util.Arrays;

public class selectionSort {
	public static void selectionSort(int[] a){
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{1,5,7,3,8,8,2};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
