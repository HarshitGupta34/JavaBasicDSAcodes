package multidimensionalArray;

import java.util.ArrayList;

public class pascaltriangle {
     public static ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<ArrayList<Integer>> arr =new ArrayList<>();
        for (int i=0 ;i<n ;i++){
            ArrayList<Integer> a =new ArrayList<>();
            for(int j=0;j<=i; j++){
                a.add(0);
            }
            arr.add(a);
        }

        for (int i=0 ;i<n ;i++){
            for (int j=0 ;j<=i ;j++){
                if(j==0 || j==i)
                    arr.get(i).set(j,1);
                else
                    arr.get(i).set(j,arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
            }
        }
        return arr.get(n-1);
    }

    public static void main(String[] args) {
        System.out.println(nthRowOfPascalTriangle(5));
    }
}
