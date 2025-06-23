package VeryBasic;
import java.util.Scanner;
public class findingOrigin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate : ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate : ");
        int y = sc.nextInt();
        if (x==0 && y==0){
            System.out.println("Lies on origin");
        }
        else if(y==0){
            System.out.println("Lies on x axis");
        }
        else if(x==0){
            System.out.println("Lies on y axis");
        }
        else if(x>0 && y>0){
            System.out.println("Lies on 1 quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("Lies on 2 quadrant");
        }
        else if(x<0 &&  y<0){
            System.out.println("Lies on 3 quadrant");
        }
        else{
            System.out.println("Lies on 4 quadrant");
        }

    }
}
