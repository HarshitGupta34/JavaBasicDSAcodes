package ArraysInJava;

public class waveArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,8,9};

        for (int i=0 ;i<arr.length-1 ;i=i+2){
            int temp= arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;

        }
        for(int ele:arr) System.out.print(ele);
    }
}
