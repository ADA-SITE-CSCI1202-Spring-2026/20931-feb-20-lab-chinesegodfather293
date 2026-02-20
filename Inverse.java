import java.util.Scanner;
public class Inverse {
    public String reverse(String s){
    StringBuilder stringBuilder = new StringBuilder(s);
    return new StringBuilder(s).reverse().toString();
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s= scan.next();
    }
}
