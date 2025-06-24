package ArraysInJava;

public class MaximumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,465,-254,120};
        int max = arr[0];
        for (int i =0 ;i< arr.length ;i++){
            if (arr[i]>max ) max =arr[i];
        }
        System.out.println("Maximum of array is "+ max);
    }
}
