package importantquestions;
import java.util.Scanner;
public class primeNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if (n<=1){
            System.out.println("Neither Prime nor Composite");
        }
        else {
            boolean isprime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) System.out.println("It is a prime no. ");
            else System.out.println("It is a composite no. ");
        }
    }
}