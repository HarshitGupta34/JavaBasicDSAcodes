package ArraysInJava;
import java.util.Scanner;
public class searchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =new int[5];
        System.out.print("Enter elements of array :");
        for (int i =0 ;i<arr.length ;i++ ){
            arr[i] =sc.nextInt();
        }
        System.out.print("Enter the num you want to search :");
        int num = sc.nextInt();
        for (int i=0 ;i<arr.length ;i++){
            if (arr[i]==num){
                System.out.println("Number found at index :" + i);
            }

        }
    }
}
