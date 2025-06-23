package VeryBasic;
import java.util.Scanner;
public class checkingmagnitude69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int value = sc.nextInt();
        if (value<0){
            value=value*(-1);
        }
        if (value >69){
            System.out.println("Value is greater than 69");
        }
        else if(value==69){
            System.out.println("Vale is equal to 69");
        }
        else {
            System.out.println("Value is smaller than 69");
        }
    }
}
