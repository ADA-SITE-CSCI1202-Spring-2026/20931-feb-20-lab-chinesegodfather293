import java.util.Scanner;
public class MaxMin {
        int findMax (int[] num){
            int max = num[0];
            int n = num.length;
            for (int i = 0; i<n;i++){
                if (num[i]>max){
                    max = num[i];
                }
            }
            return max;
        }
        int findMin (int[] num){
            int min = num[0];
            int n = num.length;
            for (int i = 0; i<n;i++){
                if (num[i]<min){
                    min = num[i];
                }
            }
            return min;
        }
        int[] findMaxMin (int[] num){
            int max = num[0];
            int min = num[0];
            int n =num.length;
            for (int i = 0; i<n;i++){
                if (num[i]>max){
                    max = num[i];
                }
                if (num[i]<min){
                    min = num[i];
                }
            }
            return new int[]{min, max};
        }
    public static void main(String[] args) {
        int[] numbers; 
        Scanner scan = new Scanner(System.in);
        System.out.println("n=");
        int n = scan.nextInt();
        numbers = new int[n];
        for (int i = 0; i<n; i++){
            numbers[i] = scan.nextInt();
        }
        scan.close();
    }
}
