package ArraysInJava;
import java.util.Scanner;
public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        int[] arr= new int[4];
//        int[] arr ={1,2,3,4};
        int[] arr =new int[5];
        for (int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int j =0; j< arr.length ;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
