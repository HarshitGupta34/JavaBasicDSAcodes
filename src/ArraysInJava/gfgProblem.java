package ArraysInJava;

public class gfgProblem {
    // User function Template for Java

//    class Solution {
//        static void leftRotate(int arr[], int d) {
//            // code here
//            int n=arr.length;
//            reverse(arr,0,d-1);
//            reverse(arr,d,n-1);
//            reverse(arr,0,n-1);
//        }
//        static void reverse(int[] arr , int i , int j){
//            while(i<j){
//                int temp=arr[i];
//                arr[i] = arr[j];
//                arr[j]=temp;
//                i++;
//                j--;
//            }
//        }
//    }

}



//class Solution {
//    int missingNum(int arr[]) {
//        // code here
//        int n = arr.length +1;
//        int sum =n*(n+1)/2;
//        int arraySum=0;
//        for(int ele :arr){
//            arraySum+=ele;
//        }
//        return sum-arraySum;
//    }
//}

//class Solution {
//    // Function for adding one to the number represented by the array
//    Vector<Integer> addOne(int[] arr) {
//        // code here
//        Vector<Integer> ans =new Vector<>();
//        int n=arr.length;
//        int carry =1;
//        for (int i=n-1 ;i>=0;i--){
//            if (arr[i]+carry <=9){
//                ans.add(arr[i]+carry);
//                carry=0;
//            }
//            else {
//                ans.add(0);
//                carry=1;
//            }
//        }
//        if(carry==1) ans.add(1);
//        Collections.reverse(ans);
//        return ans;
//    }
//}