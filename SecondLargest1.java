import java.util.Arrays;
public class SecondLargest1 {
    public static void main(String args[]){
        int arr[] = {10,20,23,50,60};
        int size = arr.length;
        Arrays.sort(arr);
        System.out.println("sorted Array:"+Arrays.toString(arr));
        int res = arr[size - 2];
        System.out.println("2nd largest element is:"+res);
    }
}
