package patternPrinting;
import java.util.Scanner;
public class reverseTraiangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1 ;i<=n ; i++){
            for (int j =1 ; j<=n-i+1 ;j++){
                System.out.print("*" );
            }
            System.out.println();
        }
    }
}
//or we can you a variable which store n and then a--
