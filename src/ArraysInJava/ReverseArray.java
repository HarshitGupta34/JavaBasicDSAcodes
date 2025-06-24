package ArraysInJava;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int i =0 , j=n-1; //change  the index to do partial reverse
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele :arr) System.out.print(ele +" ");
    }
}
