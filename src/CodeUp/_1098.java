package CodeUp;

import java.util.Scanner;

public class _1098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h, w, n, l, d, x, y;
        h = scanner.nextInt();
        w = scanner.nextInt();

        int a[][] = new int[h + 1][w + 1];
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                a[i][j] = 0;
            }
        }

        // 첫 줄에 격자판의 세로(h), 가로(w)
        // 두 번째 줄에 놓을 수 있는 막대의 개수(n)
        // 세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)

        n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            l = scanner.nextInt();
            d = scanner.nextInt();
            x = scanner.nextInt();
            y = scanner.nextInt();

            if (d == 0){
                for(int j = 0; j < l; j++){
                    a[x][y + j] = 1;
                }
            }

            if (d == 1){
                for(int j = 0; j < l; j++){
                    a[x + j][y] = 1;
                }
            }
        }

        for (int i = 1; i <= h; i++){
            for (int j = 1; j <= w; j++){
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
