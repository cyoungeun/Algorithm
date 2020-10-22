package CodeUp;

import java.util.Scanner;

public class _1095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k[] = new int[n];

        for (int i = 0; i < n; i++){
            k[i] = scanner.nextInt();
        }

        int min = k[0]; // 최소값
        for (int j = 0; j < k.length; j++){
            if(min > k[j]){
                min = k[j];
            }
        }
        System.out.println(min);
    }
}
