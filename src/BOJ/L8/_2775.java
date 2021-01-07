package BOJ.L8;

import java.util.Scanner;

public class _2775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 아파트 거주 조건
        // a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들 수의 합만큼 사람들을 데려와 살아야함

        // k층에 n호에는 몇 명이 살고 있는지 출력
        // 아파트에는 0층부터 각 층에는 1호부터 , 0층의 i호에는 i명이 산다.
        // 1 ≤ k, n ≤ 14

        int t = scanner.nextInt();
        int[][] apt = new int[15][14];

        for (int i = 0; i < 14; i++) {
            apt[0][i] = i + 1;
        }

        for (int i = 1; i < apt.length; i++) {
            for (int j = 0; j < apt[i].length; j++) {
                for (int l = 0; l <= j; l++) {
                    apt[i][j] += apt[i - 1][l];
                }
            }
        }

        for (int i = 0; i < t; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();

            System.out.println(apt[k][n - 1]);
        }
    }
}
