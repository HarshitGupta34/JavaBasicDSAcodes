package Recursion;

public class PalindromeString {
    public static boolean palin(int i,int n , String s){
        if (i >= n/2) return true;
        if (s.charAt(i)!= s.charAt(n-i-1)) return false;
        return palin(i+1 ,n ,s);
    }
    public static void main(String[] args) {
        String s = "madam";
        int n = s.length();
        System.out.println(palin(0 ,n ,s));
    }
}
