package patternPrinting;
import java.util.Scanner;
public class triangleverticallyflipped {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for (int j=1; j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j =1;j<=i; j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
