import java.util.*;

public class Main {
    
    // https://www.hackerrank.com/challenges/java-negative-subarray/problem
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int count = 0;
        
        for (int i = 0; i < n*(n+1)/2; i++) {
            int index = 0;
            
            for (int j = i; j < n ; j++) {
                int result = 0;
                for (int k = i; k <= j; k++) {
                    result += array[k];
                }
                if (result < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        
    }
}