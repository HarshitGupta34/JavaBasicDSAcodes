package VeryBasic;
import java.util.Scanner;
public class ap {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 1 ; i<=n ;i++){
            System.out.println(i);
            System.out.println(n-i+1);
        }
    }
}
