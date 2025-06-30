package ArraysInJava;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasic {
    public static void main(String[] args ){
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(13);
        arr.add(56);
//        System.out.println(arr.get(2));
        arr.set(2,50);
        int n =arr.size();
//        for (int i=0 ;i<n;i++){
//            System.out.println(arr.get(i));
//        }
//        arr.add(1,100)
        arr.remove(arr.size()-1);
        System.out.println(arr);
//        Collections.reverse(arr);
//
//      int i=0,j=arr.size()-1;
//      while(i<j){
//          int temp =arr.get(i);
//          arr.set(i,arr.get(j));
//          arr.set(j,temp);
//          i++;
//          j--;
//        }
//

//        System.out.println(arr.get(2));
        System.out.println(arr);


    }
}
