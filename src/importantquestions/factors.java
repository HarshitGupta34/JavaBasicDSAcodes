package importantquestions;
import java.util.Scanner;
public class factors {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 1 ; i<=Math.sqrt(n) ;i++){
            if (n%i==0){
                System.out.println(i);
                if (i != n/i) {
                    System.out.println(n / i);
                }
            }
        }
    }
}
