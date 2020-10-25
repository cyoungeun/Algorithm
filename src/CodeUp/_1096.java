package CodeUp;

import java.util.Scanner;

public class _1096 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, x, y;
        int a[][] = new int[20][20];
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            x = scanner.nextInt();
            y = scanner.nextInt();
            a[x][y] = 1;
        }

        for (int i = 1; i <= 19; i++){
            for (int j = 1; j <= 19; j++){
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }

    }
}
