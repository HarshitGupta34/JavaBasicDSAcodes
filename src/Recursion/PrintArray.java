package Recursion;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5};
        int n= arr.length;
        recPri(arr,0);
    }

    private static void recPri(int[] arr, int i) {
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        recPri(arr,i+1);
    }
}
