package multidimensionalArray;
import java.util.ArrayList;
//gfg problem
public class spiralMatrixTravesel {

        public ArrayList<Integer> spirallyTraverse(int[][] arr) {
            // code here
            ArrayList<Integer> ans = new ArrayList<>();
            int minr = 0 ,maxr = arr.length-1 ;
            int minc =0 , maxc =arr[0].length-1;
            int count= 0;
            while(minr<=maxr && minc <=maxc && count!= arr.length *arr[0].length ){
                for (int i = minc ; i<=maxc ;i++){
                    ans.add(arr[minr][i]);
                    count++;
                }
                minr++;
                if(count == arr.length *arr[0].length ) break ;


                for (int i = minr ; i<=maxr ;i++){
                    ans.add(arr[i][maxc]);
                    count++;
                }
                maxc--;
                if(count == arr.length *arr[0].length ) break ;


                for (int i = maxc ; i>=minc ;i--){
                    ans.add(arr[maxr][i]);
                    count++;
                }
                maxr--;
                if(count == arr.length *arr[0].length ) break ;



                for (int i = maxr ; i>=minr ;i--){
                    ans.add(arr[i][minc]);
                    count++;
                }
                minc++;
                if(count == arr.length *arr[0].length ) break ;
            }
            return ans;
        }
    }


