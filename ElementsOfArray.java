//Java Program to print the elements of an array
public class ElementsOfArray {
    public static void main(String[] args){
        //Initialize array
        int [] arr = new int [] {1,2,3,4,5};
        System.out.println("Elements of an array:");
        //Loop through the array by incrementing value of i
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i] + "");
        }
    }
}