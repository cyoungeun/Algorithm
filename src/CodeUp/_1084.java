package CodeUp;

import java.util.Scanner;

public class _1084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, g, b, count = 0;
        r = scanner.nextInt();
        g = scanner.nextInt();
        b = scanner.nextInt();

        for(int i = 0; i < r; i++){
            for(int j = 0; j < g; j++){
                for(int k = 0; k < b; k++){
                    System.out.printf("%d %d %d\n", i, j, k);
                    count++;
                }
            }
        }
        System.out.printf("%d", count);
    }
}
