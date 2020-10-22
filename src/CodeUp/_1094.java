package CodeUp;

import java.util.Scanner;

public class _1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k[] = new int[n];
        for (int i = 0; i < n; i++){
            k[i] = scanner.nextInt();
        }

        for (int j = k.length-1; j >= 0; j--){
            System.out.printf("%d ", k[j]);
        }


    }
}
