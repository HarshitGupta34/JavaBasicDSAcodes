package patternPrinting;

import java.util.Scanner;

public class emptyBoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col =sc.nextInt();
        for (int i=1 ;i<=row ; i++){
            for (int j =1 ; j<=col ;j++){
                if (i==1 || j==1 || j==col || i==row) {
                    System.out.print("* ");
                }
                else System.out.print("  ");//double space
            }
            System.out.println();
        }
    }
}
