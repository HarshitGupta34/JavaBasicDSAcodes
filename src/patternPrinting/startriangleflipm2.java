package patternPrinting;

import java.util.Scanner;
//correct method

public class startriangleflipm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

//
//Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
//        int nsp = n-1, nst = 1;
//for(int i=1;i<=n;i++){ // lines
//        for(int j=1;j<=nsp;j++){ // spaces
//        System.out.print(" "+" ");
//    }
//            for(int j=1;j<=nst;j++){ // stars
//        System.out.print("*"+" ");
//    }
//nsp--; nst += 2;
//        System.out.println();
//}
//nsp = 1; nst = 2*n-3;
//        for(int i=1;i<=n-1;i++){ // lines
//        for(int j=1;j<=nsp;j++){ // spaces
//        System.out.print(" "+" ");
//    }
//            for(int j=1;j<=nst;j++){ // stars
//        System.out.print("*"+" ");
//    }
//nsp++; nst -= 2;
//        System.out.println();
//}